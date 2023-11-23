package com.question.controller;

import com.question.entities.Question;
import com.question.service.QuestionSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController
{
    @Autowired
    private QuestionSerive questionSerive;
    @PostMapping("/create")
    public Question create(@RequestBody Question question){
        return questionSerive.Add(question);
    }
    @GetMapping("/getallQuestion")
    public List<Question> getAllQuestion(){
        return questionSerive.getAllQuestion();
    }
    @GetMapping("/{id}")
    public Question getSingle(@PathVariable Long id){
        return questionSerive.getSingle(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId){
    return questionSerive.getQuestionOfQuiz(quizId);
    }
}
