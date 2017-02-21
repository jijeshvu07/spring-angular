package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "school_max_period")
public class SchoolMaxPeriod implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private int maxPeriods;
	@DBRef
	private School school;
	private Date modifiedDate;
	private boolean isDelete;

	public SchoolMaxPeriod() {
		super();
	}

	public SchoolMaxPeriod(String id, int maxPeriods, School school, Date modifiedDate, boolean isDelete) {
		super();
		this.id = id;
		this.maxPeriods = maxPeriods;
		this.school = school;
		this.modifiedDate = modifiedDate;
		this.isDelete = isDelete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMaxPeriods() {
		return maxPeriods;
	}

	public void setMaxPeriods(int maxPeriods) {
		this.maxPeriods = maxPeriods;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
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
