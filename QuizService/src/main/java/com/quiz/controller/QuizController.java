package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import com.quiz.services.QuestionClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;
    @Autowired
    private QuestionClient questionClient;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }
    @GetMapping
    public List<Quiz> get(){
        List<Quiz> quizList=quizService.get();
        quizList.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return quizList;
    }
    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        Quiz quiz = quizService.get(id);
        quiz.setQuestions(questionClient.getQuestionOfQuiz(id));
        return quiz;
    }
}
