package com.quiz.contoller;

import com.quiz.entity.Quiz;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz){
        return  quizService.add(quiz);
    }
    @GetMapping("/getAllQuiz")
    public List<Quiz> getAllQuiz(){
        return  quizService.get();
    }
    @GetMapping("/{id}")
    public Quiz getSingle(@PathVariable Long id){
        return  quizService.getSingle(id);
    }
}
