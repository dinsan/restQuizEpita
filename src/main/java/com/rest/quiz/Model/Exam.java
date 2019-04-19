/**
 *  this is exam module
 *  project for EPIA advance JAVA programme
 *  
 */
package com.rest.quiz.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author DINSAN
 *
 */

@Entity
public class Exam {
	
	   @Id
	    @GeneratedValue
	    private int id;
	    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExamTitle() {
		return examTitle;
	}
	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}
		private String examTitle;

}
