package com.quiz.entity;

import lombok.Data;

@Data
public class Question {
    private Long quetionId;
    private String  question;
    private Long quizId;
}
