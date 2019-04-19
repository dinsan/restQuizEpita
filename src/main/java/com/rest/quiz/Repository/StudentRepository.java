package com.rest.quiz.Repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.quiz.Model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {} 
