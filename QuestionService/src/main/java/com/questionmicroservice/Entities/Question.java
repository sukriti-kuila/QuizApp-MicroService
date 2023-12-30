package com.questionmicroservice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long qid;
	private String question;
	private Long quizId;
	
	public Long getQid() {
		return qid;
	}
	public void setQid(Long qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizid) {
		this.quizId = quizid;
	}
	
	public Question (Long qid, String question, Long quizid) {
		this.qid = qid;
		this.question = question;
		this.quizId = quizid;
	}
	
	
	public Question () {
		
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", quizid=" + quizId + "]";
	}
	
	
	
}
