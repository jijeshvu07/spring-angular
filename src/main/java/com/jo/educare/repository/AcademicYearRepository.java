package com.jo.educare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jo.educare.model.entity.AcademicYear;

@Repository
public interface AcademicYearRepository extends MongoRepository<AcademicYear, String>{

}
