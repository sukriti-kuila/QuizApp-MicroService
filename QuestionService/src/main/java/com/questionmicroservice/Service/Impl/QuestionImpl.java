package com.questionmicroservice.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questionmicroservice.Entities.Question;
import com.questionmicroservice.Repo.QuestionRepo;
import com.questionmicroservice.Service.QuestionService;

@Service
public class QuestionImpl implements QuestionService{
	@Autowired
	private QuestionRepo quesrepo;
	@Override
	public Question create(Question q) {
		return quesrepo.save(q);
	}

	@Override
	public List<Question> getAll() {
		return quesrepo.findAll();
	}

	@Override
	public Question getOne(Long id) {
		return quesrepo.findById(id).orElseThrow(()->new RuntimeException("Question Id Not Found"));
	}
	
	public String delete (Long id) {
		quesrepo.deleteById(id);
		return "Question with id "+id+" has been deleted";
	}
	
}
