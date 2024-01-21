package com.question.controller;

import com.question.entities.QuestionEntity;
import com.question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
   private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public QuestionEntity create(@RequestBody QuestionEntity question){
        return questionService.add(question);
    }

    @GetMapping
    public List<QuestionEntity> getAll(){
        return questionService.get();
    }
    @GetMapping("/{questionId}")
    public QuestionEntity getOne(@PathVariable Long questionId){
        return questionService.get(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    public List<QuestionEntity> getQuestionsofQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
