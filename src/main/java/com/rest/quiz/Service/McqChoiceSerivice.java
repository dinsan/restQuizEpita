package com.rest.quiz.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.quiz.Model.McqChoice;
import com.rest.quiz.Repository.McqChoiceRespository;

@Service
public class McqChoiceSerivice {

	
    @Autowired
    
    McqChoiceRespository mqChoiceRepository;

    public List<McqChoice> getAllmqChoice() {
        List<McqChoice> mqChoices = new ArrayList<McqChoice>();
        mqChoiceRepository.findAll().forEach(mqChoice -> mqChoices.add(mqChoice));
        return mqChoices;
    }

    public McqChoice getmqChoiceById(int id) {
        return mqChoiceRepository.findById(id).get();
    }

    public void saveOrUpdate(McqChoice mqChoice) {
		mqChoiceRepository.save(mqChoice);
    }

    public void delete(int id) {
    	mqChoiceRepository.deleteById(id);
    }
    
}
