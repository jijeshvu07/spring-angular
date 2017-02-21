package com.jo.educare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jo.educare.model.entity.School;
import com.jo.educare.model.entity.UserAccount;

@Repository
public interface SchoolRepository extends MongoRepository<School, String>{
   School findByUserAccount(UserAccount userAccount);
}
