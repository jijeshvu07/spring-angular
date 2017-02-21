package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "standard_division")
public class StandardDivision implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String standardDivision;
	@DBRef
	private Standard standard;
	private String div;
	private long maximumStrength;
	@DBRef
	private School school;
	private Date modifiedDate;
	private boolean isDelete;

	public StandardDivision() {
		super();
	}

	public StandardDivision(String id, String standardDivision, Standard standard, String div,long maximumStrength, School school, 
			Date modifiedDate, boolean isDelete) {
		super();
		this.id = id;
		this.standardDivision = standardDivision;
		this.standard = standard;
		this.div = div;
		this.school = school;
		this.modifiedDate = modifiedDate;
		this.isDelete = isDelete;
		this.maximumStrength = maximumStrength;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStandardDivision() {
		return standardDivision;
	}

	public void setStandardDivision(String standardDivision) {
		this.standardDivision = standardDivision;
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	
	public long getMaximumStrength() {
		return maximumStrength;
	}

	public void setMaximumStrength(long maximumStrength) {
		this.maximumStrength = maximumStrength;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
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
