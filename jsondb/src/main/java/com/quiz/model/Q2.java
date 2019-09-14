package com.quiz.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
public class Q2 {
	private String question;
	 ArrayList < Object > options = new ArrayList < Object > ();

	 private String answer;


	 // Getter Methods 

	 public String getQuestion() {
	  return question;
	 }

	 public String getAnswer() {
	  return answer;
	 }

	 // Setter Methods 

	 public void setQuestion(String question) {
	  this.question = question;
	 }

	 public void setAnswer(String answer) {
	  this.answer = answer;
	 }

	public ArrayList<Object> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<Object> options) {
		this.options = options;
	}
}
