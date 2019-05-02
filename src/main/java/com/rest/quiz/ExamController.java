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

import com.rest.quiz.Model.Exam;
import com.rest.quiz.Service.ExamSerivice;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ExamController {

	@Autowired
	ExamSerivice examService;
	
	@GetMapping("/exam")
    private List<Exam> getAllExam() {
        return examService.getAllExam();
    }
	
	@GetMapping("/exam/{id}")
    private Exam getExam(@PathVariable("id") int id) {
        return examService.getExamById(id);
    }

    @DeleteMapping("/exam/{id}")
    private void deleteExam(@PathVariable("id") int id) {
    	examService.delete(id);
    }

    @PostMapping("/exam")
    private int saveExam(@RequestBody Exam exam) {
    	examService.saveOrUpdate(exam);
        return exam.getId();
    }
    
    @PutMapping("/exam")
    private int updateExam(@RequestBody Exam exam) {
    	examService.saveOrUpdate(exam);
        return exam.getId();
    }
}
