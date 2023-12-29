package com.quizmicroservice.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizmicroservice.Entities.Quiz;
import com.quizmicroservice.Services.*;
import com.quizmicroservice.Repo.*;

@Service
public class QuizServiceImpl implements QuizService{
	@Autowired
	private QuizRepository quizrepo;
	
	@Override
	public Quiz add(Quiz q) {
		return quizrepo.save(q);
	}

	@Override
	public List<Quiz> get() {
		return quizrepo.findAll();
	}

	@Override
	public Quiz get(Long id) {
		return quizrepo.findById(id).orElseThrow(()-> new RuntimeException("id not found"));
	}

	@Override
	public void delete(Long id) {
		quizrepo.deleteById(id);
	}
	
	
}
