package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Answer_table")
public class Answer3 {
	@Id
	private int answer_id;
	private String answer;
	@OneToOne(mappedBy = "answer")
//	@OneToOne
	private Question3 question;
	public Answer3(int answer_id, String answer, Question3 question) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.question = question;
	}
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
	public Question3 getQuestion() {
		return question;
	}
	public void setQuestion(Question3 question) {
		this.question = question;
	}
	public Answer3() {
		super();
		// TODO Auto-generated constructor stub
	}

}
