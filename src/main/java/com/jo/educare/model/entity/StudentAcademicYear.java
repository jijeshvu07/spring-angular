package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student_academic_year")
public class StudentAcademicYear implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@DBRef
	private Student student;
	private int rollNo;
	@DBRef
	private StandardDivisionAcademicYear standardDivisionAcademicYear;
	@DBRef
	private StandardDivision standard;
	@DBRef
	private AcademicYear academicYear;
	@DBRef
	private School school;
	private String photo;
	private Date modifiedDate;
	private boolean isDelete;

	public StudentAcademicYear() {
		super();
	}

	public StudentAcademicYear(String id, Student student, int rollNo,
			StandardDivisionAcademicYear standardDivisionAcademicYear, StandardDivision standard,
			AcademicYear academicYear, School school, String photo, Date modifiedDate, boolean isDelete) {
		super();
		this.id = id;
		this.student = student;
		this.rollNo = rollNo;
		this.standardDivisionAcademicYear = standardDivisionAcademicYear;
		this.standard = standard;
		this.academicYear = academicYear;
		this.school = school;
		this.photo = photo;
		this.modifiedDate = modifiedDate;
		this.isDelete = isDelete;
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

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public StandardDivision getStandard() {
		return standard;
	}

	public void setStandard(StandardDivision standard) {
		this.standard = standard;
	}

	public AcademicYear getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public StandardDivisionAcademicYear getStandardDivisionAcademicYear() {
		return standardDivisionAcademicYear;
	}

	public void setStandardDivisionAcademicYear(StandardDivisionAcademicYear standardDivisionAcademicYear) {
		this.standardDivisionAcademicYear = standardDivisionAcademicYear;
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
