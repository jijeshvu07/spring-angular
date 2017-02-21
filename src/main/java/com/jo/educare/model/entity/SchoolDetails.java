package com.jo.educare.model.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "school_details")
public class SchoolDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String affiliation;
	private double totalAmount;
	private double pricePerStudent;
	private int smsCount;
	@DBRef
	private School school;
	private boolean isDelete;

	public SchoolDetails() {
		super();
	}

	public SchoolDetails(String id, String affiliation, double totalAmount, double pricePerStudent, int smsCount,
			School school, boolean isDelete) {
		super();
		this.id = id;
		this.affiliation = affiliation;
		this.totalAmount = totalAmount;
		this.pricePerStudent = pricePerStudent;
		this.smsCount = smsCount;
		this.school = school;
		this.isDelete = isDelete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public double getPricePerStudent() {
		return pricePerStudent;
	}

	public void setPricePerStudent(double pricePerStudent) {
		this.pricePerStudent = pricePerStudent;
	}

	public int getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

}
