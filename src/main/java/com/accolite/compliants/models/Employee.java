/**
 * 
 */
package com.accolite.compliants.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Raghuvardhan
 *
 */

@Entity
public class Employee {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String name;
	private String emailId;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String emailId) {
		super();
		this.name = name;
		this.emailId = emailId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
