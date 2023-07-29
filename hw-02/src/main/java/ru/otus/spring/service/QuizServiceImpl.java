package ru.otus.spring.service;

//import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.otus.spring.dao.QuestionDAO;
import ru.otus.spring.domain.Question;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {
    private final QuestionDAO questionsPool;

    @Autowired
    public QuizServiceImpl(QuestionDAO dao) {
        this.questionsPool = dao;
    }

    @Override
    public List<Question> getAllQuestions() {
        return this.questionsPool.getAll();
    }
}
