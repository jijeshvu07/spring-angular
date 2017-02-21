package com.jo.educare.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jo.educare.repository.AbsentRepository;
import com.jo.educare.services.AbsentService;

@Service
public class AbsentServiceImpl implements AbsentService{
    @Autowired
	private AbsentRepository absentRepository;
	
}
