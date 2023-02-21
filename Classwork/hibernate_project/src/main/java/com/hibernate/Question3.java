package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Question_table")
public class Question3 {
	@Id
	private int question_id;
	private String Question;
	@OneToOne
	private Answer3 answer;
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Answer3 getAnswer() {
		return answer;
	}
	public void setAnswer(Answer3 answer) {
		this.answer = answer;
	}
	public Question3(int question_id, String question, Answer3 answer) {
		super();
		this.question_id = question_id;
		Question = question;
		this.answer = answer;
	}
	public Question3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
