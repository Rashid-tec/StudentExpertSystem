package com.mod.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mod.entity.Student;
import com.mod.repo.StudentRepo;
import com.mod.service.Service;


@org.springframework.stereotype.Service
public class serviceImpl implements Service {
    
	@Autowired
	private StudentRepo studentrepo;
	
	@Override
	public String Savestudent(Student s) {
		
		return "Student Register successful"+studentrepo.save(s);
	}

	@Override
	public Student getStudentone(Integer id) {
		
		return studentrepo.findById(id).get();
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentrepo.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		studentrepo.deleteById(id);
		
	}
	
}
