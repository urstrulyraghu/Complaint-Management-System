/**
 * 
 */
package com.accolite.compliants.models;

import javax.persistence.Entity;

/**
 * @author Raghuvardhan
 *
 */

@Entity
public class Department {

	private static final long serialVersionUID = 1L;

	@javax.persistence.Id
	private int Id;
	private String name;
	private String emailId;
	
	
	public Department(String name, String emailId) {
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
	
	
	
}
