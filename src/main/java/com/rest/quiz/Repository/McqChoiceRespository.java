package com.rest.quiz.Repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.quiz.Model.McqChoice;

public interface McqChoiceRespository extends CrudRepository<McqChoice, Integer> {

}
