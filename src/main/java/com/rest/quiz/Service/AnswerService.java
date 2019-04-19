package com.rest.quiz.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.quiz.Model.Answer;
import com.rest.quiz.Repository.AnswerRespository;;

@Service
public class AnswerService {

	 @Autowired
	 AnswerRespository AnswerRepository;

	    public List<Answer> getAllAnswer() {
	        List<Answer> Answers = new ArrayList<Answer>();
	        AnswerRepository.findAll().forEach(Answer -> Answers.add(Answer));
	        return Answers;
	    }

	    public Answer getAnswerById(int id) {
	        return AnswerRepository.findById(id).get();
	    }

	    public void saveOrUpdate(Answer Answer) {
			AnswerRepository.save(Answer);
	    }

	    public void delete(int id) {
	    	AnswerRepository.deleteById(id);
	    }
	    
}
