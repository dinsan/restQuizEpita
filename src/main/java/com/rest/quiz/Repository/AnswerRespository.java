package com.rest.quiz.Repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.quiz.Model.Answer;

public interface AnswerRespository extends CrudRepository<Answer, Integer> {

}
