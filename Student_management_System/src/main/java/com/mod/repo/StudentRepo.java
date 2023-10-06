package com.mod.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mod.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
