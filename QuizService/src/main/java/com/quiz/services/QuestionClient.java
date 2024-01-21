package com.quiz.services;

import com.quiz.entities.QuestionEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {
    @GetMapping("/question/quiz/{id}")
    List<QuestionEntity> getQuestionOfQuiz(@PathVariable Long id);
}
