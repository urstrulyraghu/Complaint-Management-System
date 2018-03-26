package com.accolite.compliants.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Compliant {
	
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String title;
	private Employee employee;
	private String description;
	private Department department;
	private String priority;
	private Date date;
	
	
	public Compliant(String title, Employee employee, String description, Department department, String priority,
			Date date) {
		super();
		this.title = title;
		this.employee = employee;
		this.description = description;
		this.department = department;
		this.priority = priority;
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
