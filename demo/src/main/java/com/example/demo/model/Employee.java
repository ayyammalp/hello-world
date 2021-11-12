package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"EmployeeInfo\"")
public class Employee {
	@Column(name="\"employeename\"")
	private String employeename;
	@Column(name="\"employeeid\"")
	private String employeeid;
	@Column(name="\"department\"")
	private String department;
	@Column(name="\"projectname\"")
	private String projectname;
	@Column(name="\"address\"")
	private String address;
	@Column(name="\"city\"")
	private String city;
	
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
