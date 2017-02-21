package com.jo.educare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jo.educare.model.entity.SchoolMaxPeriod;

@Repository
public interface SchoolMaxPeriodRepository extends MongoRepository<SchoolMaxPeriod, String>{

}
