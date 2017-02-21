package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teacher_subject")
public class TeacherSubject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@DBRef
	private Teacher teacher;
	@DBRef
	private Subject subject;
	private boolean isDelete;
	private Date modifiedDate;

	public TeacherSubject() {
		super();
	}



	public TeacherSubject(String id, Teacher teacher, Subject subject, boolean isDelete, Date modifiedDate) {
		super();
		this.id = id;
		this.teacher = teacher;
		this.subject = subject;
		this.isDelete = isDelete;
		this.modifiedDate = modifiedDate;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}



	public Date getModifiedDate() {
		return modifiedDate;
	}



	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


}
