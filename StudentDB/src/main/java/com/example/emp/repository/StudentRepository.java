package com.example.emp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emp.domain.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findAll();
}