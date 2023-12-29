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

import com.quizmicroservice.Entities.Quiz;
import com.quizmicroservice.Services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	QuizService quizservice;
	
	@PostMapping
	public Quiz create(@RequestBody Quiz q) {
//		System.out.println(q);
		return quizservice.add(q);
	}
	
	@GetMapping
	public List<Quiz> getAll() {
		return quizservice.get();
	}
	
	@GetMapping("/{id}")
	public Quiz getAQuiz(@PathVariable Long id) {
		return quizservice.get(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAQuiz(@PathVariable Long id) {
		quizservice.delete(id);
		return "Quiz with id "+id+" has been deleted successfully";
	}
	
}
