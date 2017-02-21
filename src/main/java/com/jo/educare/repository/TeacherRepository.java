package com.jo.educare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jo.educare.model.entity.Teacher;

public interface TeacherRepository extends MongoRepository<Teacher, String>{

}
