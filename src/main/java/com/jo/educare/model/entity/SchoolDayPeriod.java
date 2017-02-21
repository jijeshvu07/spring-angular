package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "school_day_period")
public class SchoolDayPeriod implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@DBRef
	private DayMaster dayMaster;
	private int noOfPeriods;
	@DBRef
	private School school;
	private Date modifiedDate;
	private boolean isDelete;

	public SchoolDayPeriod() {
		super();
	}

	public SchoolDayPeriod(String id, DayMaster dayMaster, int noOfPeriods, School school, Date modifiedDate,
			boolean isDelete) {
		super();
		this.id = id;
		this.dayMaster = dayMaster;
		this.noOfPeriods = noOfPeriods;
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

	public DayMaster getDayMaster() {
		return dayMaster;
	}

	public void setDayMaster(DayMaster dayMaster) {
		this.dayMaster = dayMaster;
	}

	public int getNoOfPeriods() {
		return noOfPeriods;
	}

	public void setNoOfPeriods(int noOfPeriods) {
		this.noOfPeriods = noOfPeriods;
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
