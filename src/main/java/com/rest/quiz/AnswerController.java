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

import com.rest.quiz.Model.Answer;
import com.rest.quiz.Service.AnswerService;;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AnswerController {

	@Autowired
	AnswerService AnswerService;
	
	@GetMapping("/answer")
    private List<Answer> getAllAnswer() {
        return AnswerService.getAllAnswer();
    }
	
	@GetMapping("/answer/{id}")
    private Answer getAnswer(@PathVariable("id") int id) {
        return AnswerService.getAnswerById(id);
    }

    @DeleteMapping("/answer/{id}")
    private void deleteAnswer(@PathVariable("id") int id) {
    	AnswerService.delete(id);
    }

    @PostMapping("/answer")
    private int saveAnswer(@RequestBody Answer Answer) {
    	AnswerService.saveOrUpdate(Answer);
        return Answer.getId();
    }
    
    @PutMapping("/answer")
    private int updateAnswer(@RequestBody Answer Answer) {
    	AnswerService.saveOrUpdate(Answer);
        return Answer.getId();
    }
}
