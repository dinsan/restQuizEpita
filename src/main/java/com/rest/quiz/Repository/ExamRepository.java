package com.rest.quiz.Repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.quiz.Model.Exam;

public interface ExamRepository extends CrudRepository<Exam, Integer> {

}
