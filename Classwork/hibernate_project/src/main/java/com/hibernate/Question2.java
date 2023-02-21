package com.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question2 {
	@Id
   int question_id;
   String question;
   @OneToMany(mappedBy = "question")
   List<Answer2> answer;
public int getQuestion_id() {
	return question_id;
}
public void setQuestion_id(int question_id) {
	this.question_id = question_id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<Answer2> getAnswer() {
	return answer;
}
public void setAnswer(List<Answer2> answer) {
	this.answer = answer;
}
public Question2(int question_id, String question, List<Answer2> answer) {
	super();
	this.question_id = question_id;
	this.question = question;
	this.answer = answer;
}
public Question2() {
	super();
}
   
}
