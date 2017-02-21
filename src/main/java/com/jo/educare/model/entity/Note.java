package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "note")
public class Note implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String noteHeading;
	private String noteContent;
	@DBRef
	private Folder folder;
	private Date createdDate;
	private Date modifiedDate;
	private boolean isDelete;

	public Note() {
		super();
	}

	public Note(String id, String noteHeading, String noteContent, Folder folder, Date createdDate, Date modifiedDate,
			boolean isDelete) {
		super();
		this.id = id;
		this.noteHeading = noteHeading;
		this.noteContent = noteContent;
		this.folder = folder;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.isDelete = isDelete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNoteHeading() {
		return noteHeading;
	}

	public void setNoteHeading(String noteHeading) {
		this.noteHeading = noteHeading;
	}

	public String getNoteContent() {
		return noteContent;
	}

	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}

	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
