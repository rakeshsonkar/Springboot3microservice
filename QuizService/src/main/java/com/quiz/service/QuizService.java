
package com.quiz.service;
import com.quiz.entity.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz> get();
    Quiz getSingle(Long id);
}