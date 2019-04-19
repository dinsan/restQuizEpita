package com.rest.quiz.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.quiz.Model.Exam;
import com.rest.quiz.Repository.ExamRepository;


@Service
public class ExamSerivice {

    @Autowired
    ExamRepository examRepository;

    public List<Exam> getAllExam() {
        List<Exam> exams = new ArrayList<Exam>();
        examRepository.findAll().forEach(exam -> exams.add(exam));
        return exams;
    }

    public Exam getExamById(int id) {
        return examRepository.findById(id).get();
    }

    public void saveOrUpdate(Exam exam) {
		examRepository.save(exam);
    }

    public void delete(int id) {
    	examRepository.deleteById(id);
    }
}
