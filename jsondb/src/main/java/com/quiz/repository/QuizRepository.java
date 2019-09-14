package com.quiz.repository;

import org.springframework.data.repository.CrudRepository;

import com.quiz.model.Data;

public interface QuizRepository extends CrudRepository<Data, Long>{

}
