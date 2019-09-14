package com.quiz.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Table;

@Embeddable
public class Sport {
	
	@Embedded
	Q1 Q1Object;

	// Getter Methods

	public Q1 getQ1() {
		return Q1Object;
	}

	// Setter Methods

	public void setQ1(Q1 q1Object) {
		this.Q1Object = q1Object;
	}
}
