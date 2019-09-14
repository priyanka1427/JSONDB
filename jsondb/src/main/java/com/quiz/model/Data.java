package com.quiz.model;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "DATA")
@Entity
public class Data {
	
	@Embedded
	Quiz QuizObject;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	// Getter Methods

	public Quiz getQuiz() {
		return QuizObject;
	}

	// Setter Methods

	public void setQuiz(Quiz quizObject) {
		this.QuizObject = quizObject;
	}
}
