package com.quizmicroservice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizmicroservice.Entities.*;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
