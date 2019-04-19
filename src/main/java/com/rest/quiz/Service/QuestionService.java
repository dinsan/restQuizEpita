package com.rest.quiz.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.quiz.Model.Question;
import com.rest.quiz.Repository.QuestionsRespository;


@Service
public class QuestionService {

	@Autowired
	QuestionsRespository QuestionRepository;

    public List<Question> getAllQuestion() {
        List<Question> Questions = new ArrayList<Question>();
        QuestionRepository.findAll().forEach(Question -> Questions.add(Question));
        return Questions;
    }

    public Question getQuestionById(int id) {
        return QuestionRepository.findById(id).get();
    }

    public void saveOrUpdate(Question Question) {
		QuestionRepository.save(Question);
    }

    public void delete(int id) {
    	QuestionRepository.deleteById(id);
    }
    
}
