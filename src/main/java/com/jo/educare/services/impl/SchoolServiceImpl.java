package com.jo.educare.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jo.educare.model.entity.School;
import com.jo.educare.model.entity.UserAccount;
import com.jo.educare.repository.SchoolRepository;
import com.jo.educare.services.SchoolService;
@Service
public class SchoolServiceImpl implements SchoolService{
    @Autowired
	private SchoolRepository schoolRepository;
    
	@Override
	public void saveSchool(School school) {
		schoolRepository.save(school);	
	}

	@Override
	public School findSchoolByUserAccount(UserAccount userAccount) {
		return schoolRepository.findByUserAccount(userAccount);
	}

}
