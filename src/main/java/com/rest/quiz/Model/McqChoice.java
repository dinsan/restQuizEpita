package com.rest.quiz.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class McqChoice {

	    @Id
	    @GeneratedValue
	    private int id;
	    private String[] choice;
	    private boolean valid;
	    private int questionId;
	    
	    
		public int getQuestionId() {
			return questionId;
		}
		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String[] getChoice() {
			return choice;
		}
		public void setChoice(String[] choice) {
			this.choice = choice;
		}
		public boolean isValid() {
			return valid;
		}
		public void setValid(boolean valid) {
			this.valid = valid;
		}
}
