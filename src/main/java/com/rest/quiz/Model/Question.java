package com.rest.quiz.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {

	
	    @Id
	    @GeneratedValue
	    private int id;
	    private String question;
	    private String[] possibleChoice;
	    private String[] correctChoice;
		public int getId() {
			return id;
		}
		public String[] getPossibleChoice() {
			return possibleChoice;
		}
		public void setPossibleChoice(String[] possibleChoice) {
			this.possibleChoice = possibleChoice;
		}
		public String[] getCorrectChoice() {
			return correctChoice;
		}
		public void setCorrectChoice(String[] correctChoice) {
			this.correctChoice = correctChoice;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}

}
