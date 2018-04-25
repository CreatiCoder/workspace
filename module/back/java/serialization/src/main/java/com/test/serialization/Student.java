package com.test.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6978258184636886698L;
	private String name;
	private int height;
	private String id;
	private String department;
	
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param name
	 * @param height
	 * @param id
	 * @param department
	 */
	public Student(String name, int height, String id, String department) {
		super();
		this.name = name;
		this.height = height;
		this.id = id;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
