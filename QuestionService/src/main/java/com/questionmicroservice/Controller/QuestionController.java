package com.questionmicroservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questionmicroservice.Entities.Question;
import com.questionmicroservice.Service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private QuestionService quesservice;
	@PostMapping
	public Question create(@RequestBody Question q) {
		System.out.println(q);
		return quesservice.create(q);
	}
	
	@GetMapping
	public List<Question> getAll() {
		return quesservice.getAll();
	}
	
	@GetMapping("/{id}")
	public Question getOne(@PathVariable Long id) {
		return quesservice.getOne(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteOne(@PathVariable Long id) {
		return quesservice.delete(id);
	}
	
	@GetMapping("/quiz/{quizid}")
	public List<Question> getQuesOfAQuiz(@PathVariable Long quizid) {
		return quesservice.getQuesOfAQuiz(quizid);
	}
}
