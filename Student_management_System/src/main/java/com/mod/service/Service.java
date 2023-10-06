package com.mod.service;

import java.util.List;

import com.mod.entity.Student;

public interface Service {
	public String Savestudent(Student s);
	public Student getStudentone(Integer id);
	public List<Student> getAllStudent();
	public void deleteStudent(Integer id);

}
