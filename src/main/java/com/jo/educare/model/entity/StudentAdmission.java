package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student_admission")
public class StudentAdmission implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long id;
	@DBRef
	private Student student;
	@DBRef
	private School currentSchool;
	@DBRef
	private School previousSchool;
	@DBRef
	private AcademicYear academicYear;
	private Date admissionDate;
	private String admissionNo;
	@DBRef
	private StandardDivision standard;
	private String curriculamFolllowed;
	private Date modifiedDate;
	private boolean isDelete;

	public StudentAdmission() {
		super();
	}

	public StudentAdmission(long id, Student student, School currentSchool, School previousSchool,
			AcademicYear academicYear, Date admissionDate, String admissionNo, StandardDivision standard,
			String curriculamFolllowed, Date modifiedDate, boolean isDelete) {
		super();
		this.id = id;
		this.student = student;
		this.currentSchool = currentSchool;
		this.previousSchool = previousSchool;
		this.academicYear = academicYear;
		this.admissionDate = admissionDate;
		this.admissionNo = admissionNo;
		this.standard = standard;
		this.curriculamFolllowed = curriculamFolllowed;
		this.modifiedDate = modifiedDate;
		this.isDelete = isDelete;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public School getCurrentSchool() {
		return currentSchool;
	}

	public void setCurrentSchool(School currentSchool) {
		this.currentSchool = currentSchool;
	}

	public School getPreviousSchool() {
		return previousSchool;
	}

	public void setPreviousSchool(School previousSchool) {
		this.previousSchool = previousSchool;
	}

	public AcademicYear getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

	public StandardDivision getStandard() {
		return standard;
	}

	public void setStandard(StandardDivision standard) {
		this.standard = standard;
	}

	public String getCurriculamFolllowed() {
		return curriculamFolllowed;
	}

	public void setCurriculamFolllowed(String curriculamFolllowed) {
		this.curriculamFolllowed = curriculamFolllowed;
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
