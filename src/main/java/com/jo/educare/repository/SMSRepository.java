package com.jo.educare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jo.educare.model.entity.SMS;

@Repository
public interface SMSRepository extends MongoRepository<SMS, String>{

}
