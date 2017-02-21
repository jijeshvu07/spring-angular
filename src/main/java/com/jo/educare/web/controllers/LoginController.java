package com.jo.educare.web.controllers;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jo.educare.model.entity.UserAccount;
import com.jo.educare.services.UserAccountService;

@Controller
public class LoginController {
	
	@Autowired
	private UserAccountService userAccountService;
	
	@GetMapping({"/","/login.html"})
	public String login(){
		return "login";
	}
	
	
	@RequestMapping(value = "/loginSuccess.html", method = RequestMethod.GET)
	public String postLogin(HttpServletRequest request, HttpSession session) {
		String userName = "not logged in";
		try {
			Principal principal = request.getUserPrincipal();
			userName = principal.getName();
			session.setAttribute("currentUser", userAccountService.finByUserName(userName));
			System.out.println("logged in by - " + userName);
			if (userHasRole("SCHOOL_ADMIN")) {
				return "redirect:school-admin/index.html";
			}else if (userHasRole("TEACHER")) {
				return "redirect:teacher/index.html";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return userName;
	}
	
	public boolean userHasRole(String role) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		for (GrantedAuthority authority : authentication.getAuthorities()) {
			if (authority.getAuthority().equals(role)) {
				return true;
			}
		}
		return false;
	}
	
	@GetMapping("/save")
	public String save(){
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		UserAccount user = new UserAccount();
		user.setUsername("jijeshvu07@gmail.com");
		user.setPassword(passwordEncoder.encode("jijesh"));
		user.setEnabled(true);
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setCredentialsNonExpired(true);
		user.addRole("SCHOOL_ADMIN");
		userAccountService.saveUserAccount(user);
		return "redirect:/login";
	}
}
