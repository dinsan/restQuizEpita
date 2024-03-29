package com.rest.quiz.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.quiz.Model.Student;
import com.rest.quiz.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(student -> students.add(student));
        return students;
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    public void saveOrUpdate(Student student) {
    	studentRepository.save(student);
    }

    public void delete(int id) {
    	studentRepository.deleteById(id);
    }
}
