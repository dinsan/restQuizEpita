package com.rest.quiz.Repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.quiz.Model.Question;

public interface QuestionsRespository extends CrudRepository<Question, Integer> {

}
