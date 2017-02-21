package com.jo.educare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jo.educare.model.entity.TeacherTimetable;

@Repository
public interface TeacherTimetableRepository extends MongoRepository<TeacherTimetable, String>{

}
