package com.questionmicroservice.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questionmicroservice.Entities.Question;

public interface QuestionRepo extends JpaRepository<Question, Long>{
	List<Question> findByQuizId(Long id);
}
