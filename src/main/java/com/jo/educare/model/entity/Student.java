package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String studentCode;
	private String firstName;
	private String middleName;
	private String lastName;
	@DBRef
	private Parent parent;
	@DBRef
	private School school;
	private String gender;
	private Date dateOfBirth;
	private String birthPlace;
	private String religion;
	private String caste;
	private String adhaarNo;
	private String bloodGroup;
	private Date modifiedDate;
	private boolean isDelete;

	public Student() {
		super();
	}

	public Student(String id, String studentCode, String firstName, String middleName, String lastName, Parent parent,
			School school, String gender, Date dateOfBirth, String birthPlace, String religion, String caste,
			 boolean isDelete, String adhaarNo, String bloodGroup, Date modifiedDate) {
		super();
		this.id = id;
		this.studentCode = studentCode;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.parent = parent;
		this.school = school;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.birthPlace = birthPlace;
		this.religion = religion;
		this.caste = caste;
		this.isDelete = isDelete;
		this.adhaarNo = adhaarNo;
		this.bloodGroup = bloodGroup;
		this.modifiedDate = modifiedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public String getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(String adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
