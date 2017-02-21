package com.jo.educare.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jo.educare.model.entity.School;
import com.jo.educare.model.entity.Standard;

@Repository
public interface StandardRepository extends MongoRepository<Standard, String>{
  List<Standard> findByIsDeleteFalseAndSchool(School school);
  Page<Standard> findByIsDeleteFalseAndSchool(School school,Pageable pageable);
}
