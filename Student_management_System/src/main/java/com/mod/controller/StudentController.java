package com.mod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mod.entity.Student;
import com.mod.serviceimpl.serviceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/student")
public class StudentController {
	@Autowired
	serviceImpl serviceimp;

	@PostMapping("/save")
	public String saveStudent(@RequestBody Student s) {
		serviceimp.Savestudent(s);
		return "student register = " + s.getS_name();
	}

	@GetMapping("/all")
	public List<Student> getAll() {
		return serviceimp.getAllStudent();
	}

	@GetMapping("/getone/{id}")
	public ResponseEntity getOnestudent(@PathVariable Integer id) {
		return new ResponseEntity<>(serviceimp.getStudentone(id),HttpStatus.OK);

	}
	
	//@DeleteMapping("/delete/{id}")
  //  public  ResponseEntity<String> deleteStudent(@PathVariable Integer Id){
    //    return new ResponseEntity<>(serviceimp.deleteStudent(Id),HttpStatus.OK);
    //}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		// Integer s=s_id;
		serviceimp.deleteStudent(id);
		return id+"this Student ID Has Been  Deleted ";
	}

}
