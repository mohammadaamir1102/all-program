package com.one.to.one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int QuestionID;
	private String Question;
	@OneToOne
	private Answer answer;
	public Question(int questionID, String question, Answer answer) {
		super();
		QuestionID = questionID;
		Question = question;
		this.answer = answer;
	}
	public Question() {
		super();
		
	}
	public int getQuestionID() {
		return QuestionID;
	}
	public void setQuestionID(int questionID) {
		QuestionID = questionID;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	
	

}
