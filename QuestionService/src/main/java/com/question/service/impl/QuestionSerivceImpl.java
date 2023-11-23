package com.question.service.impl;

import com.question.entities.Question;
import com.question.repository.QuestionRepositry;
import com.question.service.QuestionSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionSerivceImpl implements QuestionSerive {
    @Autowired
    private QuestionRepositry questionRepositry;
    @Override
    public Question Add(Question question) {
        return questionRepositry.save(question);
    }

    @Override
    public List<Question> getAllQuestion() {
        return questionRepositry.findAll();
    }

    @Override
    public Question getSingle(Long id) {
        return questionRepositry.findById(id).orElseThrow(()-> new RuntimeException("Question not found"));
    }

    @Override
    public List<Question> getQuestionOfQuiz(Long quizId) {
        return questionRepositry.findByQuizId(quizId);
    }
}
