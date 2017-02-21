package com.jo.educare.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jo.educare.model.entity.School;
import com.jo.educare.model.entity.Standard;
import com.jo.educare.repository.StandardRepository;
import com.jo.educare.services.StandardService;
@Service
public class StandardServiceImpl implements StandardService{
    @Autowired
	private StandardRepository standardRepository;
	
	@Override
	public void saveStandard(Standard standard) {
		standardRepository.save(standard);		
	}

	@Override
	public List<Standard> findByIsDeleteFalseAndSchool(School school) {
		return standardRepository.findByIsDeleteFalseAndSchool(school);
	}

	@Override
	public Page<Standard> findByIsDeleteFalseAndSchoolAndPage(School school, Pageable pageable) {
		return standardRepository.findByIsDeleteFalseAndSchool(school,pageable);
	}

}
