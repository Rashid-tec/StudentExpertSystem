package com.mod.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer s_id;
	public Integer getS_id() {
		return s_id;
	}
	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_rollno() {
		return s_rollno;
	}
	public void setS_rollno(String s_rollno) {
		this.s_rollno = s_rollno;
	}
	public Student(Integer s_id, String s_name, String s_rollno,String email) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_rollno = s_rollno;
		this.email=email;
	}
	public Student() {
		super();
		
	}
	private String s_name;
	private String s_rollno;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
