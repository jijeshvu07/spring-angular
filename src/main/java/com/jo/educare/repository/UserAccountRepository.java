package com.jo.educare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jo.educare.model.entity.UserAccount;

@Repository
public interface UserAccountRepository extends MongoRepository<UserAccount, String>{
	UserAccount findByUsername(String username);
}
