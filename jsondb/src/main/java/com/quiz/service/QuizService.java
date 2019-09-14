package com.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.model.Data;
import com.quiz.repository.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	private QuizRepository quizRepository;
	
	public Iterable<Data> getAll() {
        return quizRepository.findAll();
    }

    public Data save(Data quiz) {
        return quizRepository.save(quiz);
    }

    public void save(List<Data> quiz) {
        quizRepository.saveAll(quiz);
    }

}
