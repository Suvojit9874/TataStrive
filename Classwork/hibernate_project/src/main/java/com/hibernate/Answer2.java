package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer2")
public class Answer2 {
	@Id
	@Column(name = "answer_id")
	int answer_id;
	String answer;
	@ManyToOne
	Question2 question;
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question2 getQuestion() {
		return question;
	}
	public void setQuestion(Question2 question) {
		this.question = question;
	}
	public Answer2(int answer_id, String answer, Question2 question) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.question = question;
	}
	public Answer2() {
		super();
	}
	

}
