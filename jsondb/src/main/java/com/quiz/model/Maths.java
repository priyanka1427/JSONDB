package com.quiz.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Maths {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Embedded
	Q1 Q1Object;
	/*@Embedded
	Q2 Q2Object;*/

	// Getter Methods

	public Q1 getQ1() {
		return Q1Object;
	}

	/*public Q2 getQ2() {
		return Q2Object;
	}
*/
	// Setter Methods

	public void setQ1(Q1 q1Object) {
		this.Q1Object = q1Object;
	}

	/*public void setQ2(Q2 q2Object) {
		this.Q2Object = q2Object;
	}*/
}
