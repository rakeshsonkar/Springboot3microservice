package com.question.service;

import com.question.entities.Question;

import java.util.List;

public interface QuestionSerive {
    Question Add(Question question);
    List<Question> getAllQuestion();
    Question getSingle(Long id);

    List<Question> getQuestionOfQuiz(Long quizId);
}
