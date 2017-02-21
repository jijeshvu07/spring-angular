package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "standard_division_academic_year")
public class StandardDivisionAcademicYear implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@DBRef
	private StandardDivision standard;
	@DBRef
	private School school;
	@DBRef
	private Teacher teacher;
	@DBRef
	private AcademicYear academicYear;
	private Date modifiedDate;
	private boolean isDelete;

	public StandardDivisionAcademicYear() {
		super();
	}

	public StandardDivisionAcademicYear(String id, StandardDivision standard, School school, Teacher teacher,
			AcademicYear academicYear, Date modifiedDate, boolean isDelete) {
		super();
		this.id = id;
		this.standard = standard;
		this.school = school;
		this.teacher = teacher;
		this.academicYear = academicYear;
		this.modifiedDate = modifiedDate;
		this.isDelete = isDelete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public AcademicYear getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
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
