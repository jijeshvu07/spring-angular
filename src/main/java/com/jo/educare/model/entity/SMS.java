package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sms")
public class SMS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@DBRef
	private School school;
	@DBRef
	private AcademicYear academicYear;
	@DBRef
	private UserAccount receiver;
	private Role role;
	private Date date;

	public SMS() {
		super();
	}

	public SMS(String id, School school, AcademicYear academicYear, UserAccount receiver, Role role, Date date) {
		super();
		this.id = id;
		this.school = school;
		this.academicYear = academicYear;
		this.receiver = receiver;
		this.role = role;
		this.date = date;
	}

	public enum Role {
		ROLE_TEACHER,ROLE_PARENT
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public AcademicYear getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
	}

	public UserAccount getReceiver() {
		return receiver;
	}

	public void setReceiver(UserAccount receiver) {
		this.receiver = receiver;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
