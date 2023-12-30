package com.quizmicroservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

import com.quizmicroservice.Entities.Quiz;
import com.quizmicroservice.Services.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	private QuizService quizservice;
	@Autowired
	private QuestionClient questionclient;
	
	@PostMapping
	public Quiz create(@RequestBody Quiz q) {
		return quizservice.add(q);
	}
	
	@GetMapping
	public List<Quiz> getAll() {
		List<Quiz> quizzes = quizservice.get();
		List<Quiz> newQuizzes = quizzes.stream()
				.map(quiz->{
					quiz.setQuestions(questionclient.getQuesOfAQuiz(quiz.getId()));
					return quiz;
				})
				.collect(Collectors.toList()); 
		return newQuizzes;
	}
	
	@GetMapping("/{id}")
	public Quiz getOneQuiz(@PathVariable Long id) {
		Quiz q = quizservice.get(id);
		q.setQuestions(questionclient.getQuesOfAQuiz(q.getId()));
		return q;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAQuiz(@PathVariable Long id) {
		quizservice.delete(id);
		return "Quiz with id "+id+" has been deleted successfully";
	}
	
}
