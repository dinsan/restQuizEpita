package com.rest.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.quiz.Model.McqChoice;
import com.rest.quiz.Service.McqChoiceSerivice;

@RestController
public class McqChoiceController {

	@Autowired
	McqChoiceSerivice mcqChoiceService;
	
	@GetMapping("/mcqChoice")
    private List<McqChoice> getAllMcqChoice() {
        return mcqChoiceService.getAllmqChoice();
    }
	
	@GetMapping("/mcqChoice/{id}")
    private McqChoice getMcqChoice(@PathVariable("id") int id) {
        return mcqChoiceService.getmqChoiceById(id);
    }

    @DeleteMapping("/mcqChoice/{id}")
    private void deleteMcqChoice(@PathVariable("id") int id) {
    	mcqChoiceService.delete(id);
    }

    @PostMapping("/mcqChoice")
    private int saveMcqChoice(@RequestBody McqChoice mcqChoice) {
    	mcqChoiceService.saveOrUpdate(mcqChoice);
        return mcqChoice.getId();
    }
    
    @PutMapping("/mcqChoice")
    private int updateMcqChoice(@RequestBody McqChoice mcqChoice) {
    	mcqChoiceService.saveOrUpdate(mcqChoice);
        return mcqChoice.getId();
    }
	
}
