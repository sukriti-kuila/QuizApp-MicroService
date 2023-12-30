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
	public Question (String question) {
		this.question = question;
	}
	public Question (Long qid, String question) {
		this.qid = qid;
		this.question = question;
	}
	
	public Question () {
		
	}
	
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + "]";
	}
	
}
