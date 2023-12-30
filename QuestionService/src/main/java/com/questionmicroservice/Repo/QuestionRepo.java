package com.questionmicroservice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questionmicroservice.Entities.Question;

public interface QuestionRepo extends JpaRepository<Question, Long>{

}
