package com.jo.educare.web.controllers.schooladmin;

import java.util.Date;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jo.educare.model.entity.School;
import com.jo.educare.model.entity.Standard;
import com.jo.educare.model.entity.UserAccount;
import com.jo.educare.services.SchoolService;
import com.jo.educare.services.StandardService;
import com.jo.educare.services.UserAccountService;

@Controller
@RequestMapping("/school-admin")
public class SchoolAdminController {
	@Autowired
	private UserAccountService userAccountService;
	@Autowired
	private SchoolService schoolService;
	@Autowired
	private StandardService standardService;

	@GetMapping("/index.html")
	public String home() {
		return "/schooladmin/index";
	}

	@GetMapping("/standard.html")
	public String standard() {
		return "/schooladmin/standard";
	}

	@PostMapping(value = "saveStandard", headers = "Accept=application/json")
	@ResponseBody
	public int saveStandard(@RequestBody String standard) throws JSONException {
		JSONObject jsonObject = new JSONObject(standard);

		System.out.println(jsonObject.getJSONObject("standard").getString("name"));
		try {
			Standard newStandard = new Standard();
			newStandard.setDelete(false);
			newStandard.setModifiedDate(new Date());
			newStandard.setName(jsonObject.getJSONObject("standard").getString("name"));
			newStandard.setSchool(getSchool());
			standardService.saveStandard(newStandard);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}


	@GetMapping("getStandards")
	@ResponseBody
	public List<Standard> getPagableStandard() {
		return standardService.findByIsDeleteFalseAndSchool(getSchool());
	}

	public School getSchool() {
		UserAccount userAccount = userAccountService.getLoggedUserAccount();
		School school = schoolService.findSchoolByUserAccount(userAccount);
		return school;
	}
}
