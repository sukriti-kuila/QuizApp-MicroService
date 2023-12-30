package com.questionmicroservice.Service;

import com.questionmicroservice.Entities.Question;
import java.util.*;

public interface QuestionService {
	public Question create(Question q);
	public List<Question> getAll();
	public Question getOne(Long id);
	public String delete(Long id);
	public List<Question> getQuesOfAQuiz(Long quizid);
	
}
