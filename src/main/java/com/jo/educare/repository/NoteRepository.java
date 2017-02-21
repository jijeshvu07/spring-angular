package com.jo.educare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jo.educare.model.entity.Note;

@Repository
public interface NoteRepository extends MongoRepository<Note, String>{

}
