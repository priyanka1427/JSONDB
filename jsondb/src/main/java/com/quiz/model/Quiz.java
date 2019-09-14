package com.quiz.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class Quiz {
	/*@Embedded
	Sport SportObject;*/
	@Embedded
	Maths MathsObject;

	// Getter Methods

	/*public Sport getSport() {
		return SportObject;
	}*/

	public Maths getMaths() {
		return MathsObject;
	}

	// Setter Methods

	/*public void setSport(Sport sportObject) {
		this.SportObject = sportObject;
	}*/

	public void setMaths(Maths mathsObject) {
		this.MathsObject = mathsObject;
	}
}
