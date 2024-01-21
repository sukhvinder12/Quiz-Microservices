package com.question.services;

import com.question.entities.QuestionEntity;

import java.util.List;

public interface QuestionService {
    QuestionEntity add(QuestionEntity question);
    List<QuestionEntity> get();
    QuestionEntity get(Long questionId);
    List<QuestionEntity> getQuestionsOfQuiz(Long questionId);
}
