package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "school")
public class School implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String name;
	private String school_No;
	private String address;
	private String contact_No;
	private String email_No;
	private String schoolCode;
	@DBRef
	private UserAccount userAccount;
	private Date modifiedDate;

	public School() {
		super();
	}

	public School(String id, String name, String school_No, String address, String contact_No, String email_No,
			String schoolCode, UserAccount userAccount, Date modifiedDate) {
		super();
		this.id = id;
		this.name = name;
		this.school_No = school_No;
		this.address = address;
		this.contact_No = contact_No;
		this.email_No = email_No;
		this.schoolCode = schoolCode;
		this.userAccount = userAccount;
		this.modifiedDate = modifiedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool_No() {
		return school_No;
	}

	public void setSchool_No(String school_No) {
		this.school_No = school_No;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact_No() {
		return contact_No;
	}

	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}

	public String getEmail_No() {
		return email_No;
	}

	public void setEmail_No(String email_No) {
		this.email_No = email_No;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	

}
