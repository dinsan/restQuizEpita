package com.rest.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.quiz.Model.Question;
import com.rest.quiz.Service.QuestionService;;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class QuestionsController {

	@Autowired
	QuestionService QuestionService;
	
	@GetMapping("/question")
    private List<Question> getAllQuestion() {
        return QuestionService.getAllQuestion();
    }
	
	@GetMapping("/question/{id}")
    private Question getQuestion(@PathVariable("id") int id) {
        return QuestionService.getQuestionById(id);
    }

    @DeleteMapping("/question/{id}")
    private void deleteQuestion(@PathVariable("id") int id) {
    	QuestionService.delete(id);
    }

    @PostMapping("/question")
    private int saveQuestion(@RequestBody Question Question) {
    	QuestionService.saveOrUpdate(Question);
        return Question.getId();
    }
    
    @PutMapping("/question")
    private int updateQuestion(@RequestBody Question Question) {
    	QuestionService.saveOrUpdate(Question);
        return Question.getId();
    }
    
}
