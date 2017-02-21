package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "day_master")
public class DayMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String day;
	private String shortName;
	private Date modifiedDate;
	private boolean isDelete;

	public DayMaster() {
		super();
	}

	public DayMaster(String id, String day, String shortName, Date modifiedDate, boolean isDelete) {
		super();
		this.id = id;
		this.day = day;
		this.shortName = shortName;
		this.modifiedDate = modifiedDate;
		this.isDelete = isDelete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String short_name) {
		this.shortName = short_name;
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
