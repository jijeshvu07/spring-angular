package com.jo.educare.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teacher_timetable")
public class TeacherTimetable implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@DBRef
	private Teacher teacher;
	@DBRef
	private SchoolDayPeriod schoolDayPeriod;
	@DBRef
	private StandardDivision standard;
	private int period;
	@DBRef
	private School school;
	@DBRef
	private TeacherSubject teacherSubject;
	@DBRef
	private AcademicYear academicYear;
	private boolean isDelete;
	private Date modifiedDate;

	public TeacherTimetable() {
		super();
	}

	public TeacherTimetable(String id, Teacher teacher, SchoolDayPeriod schoolDayPeriod, StandardDivision standard, int period,
			School school, TeacherSubject teacherSubject, AcademicYear academicYear, boolean isDelete,
			Date modifiedDate) {
		super();
		this.id = id;
		this.teacher = teacher;
		this.schoolDayPeriod = schoolDayPeriod;
		this.standard = standard;
		this.period = period;
		this.school = school;
		this.teacherSubject = teacherSubject;
		this.academicYear = academicYear;
		this.isDelete = isDelete;
		this.modifiedDate = modifiedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public SchoolDayPeriod getSchoolDayPeriod() {
		return schoolDayPeriod;
	}

	public void setSchoolDayPeriod(SchoolDayPeriod schoolDayPeriod) {
		this.schoolDayPeriod = schoolDayPeriod;
	}

	public StandardDivision getStandard() {
		return standard;
	}

	public void setStandard(StandardDivision standard) {
		this.standard = standard;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public TeacherSubject getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(TeacherSubject teacherSubject) {
		this.teacherSubject = teacherSubject;
	}

	public AcademicYear getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
