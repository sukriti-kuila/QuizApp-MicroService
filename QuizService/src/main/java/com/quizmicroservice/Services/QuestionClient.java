package com.quizmicroservice.Services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quizmicroservice.Entities.Question;

import java.util.*;
//@FeignClient(url = "http://localhost:8082",value="Question-client")

@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {
	
	@GetMapping("/question/quiz/{quizid}")
	public List<Question> getQuesOfAQuiz(@PathVariable Long quizid);
}
