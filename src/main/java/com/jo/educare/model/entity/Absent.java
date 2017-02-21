package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "absent")
public class Absent implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@DBRef
	private Student student;
	@DBRef
	private StandardDivision standard;
	@DBRef
	private School school;
	@DBRef
	private StudentAcademicYear studentAcademicYear;
	private int isAbsent;
	private Date date;
	private Date modifiedDate;
	private boolean isDelete;

	public Absent() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StandardDivision getStandard() {
		return standard;
	}

	public void setStandard(StandardDivision standard) {
		this.standard = standard;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getIsAbsent() {
		return isAbsent;
	}

	public void setIsAbsent(int isAbsent) {
		this.isAbsent = isAbsent;
	}

	public StudentAcademicYear getStudentAcademicYear() {
		return studentAcademicYear;
	}

	public void setStudentAcademicYear(StudentAcademicYear studentAcademicYear) {
		this.studentAcademicYear = studentAcademicYear;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
}
