package com.question.services.impl;

import com.question.entities.QuestionEntity;
import com.question.repositories.QuestionRepository;
import com.question.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    public QuestionEntity add(QuestionEntity question) {
        return questionRepository.save(question);
    }

    @Override
    public List<QuestionEntity> get() {
        return questionRepository.findAll();
    }

    @Override
    public QuestionEntity get(Long questionId) {
        return questionRepository.findById(questionId).orElseThrow(()->new RuntimeException("Question not found"));
    }

    @Override
    public List<QuestionEntity> getQuestionsOfQuiz(Long questionId) {
        return questionRepository.findByQuizId(questionId);
    }
}
