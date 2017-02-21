package com.jo.educare.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jo.educare.model.entity.School;
import com.jo.educare.model.entity.Standard;

public interface StandardService {
  void saveStandard(Standard standard);
  List<Standard> findByIsDeleteFalseAndSchool(School school);
  Page<Standard> findByIsDeleteFalseAndSchoolAndPage(School school,Pageable pageable);
}
