package ru.otus.spring.service;

import ru.otus.spring.dao.QuestionDAO;
import ru.otus.spring.domain.Question;

import java.util.List;

public class QuizServiceImpl implements QuizService {
    private final QuestionDAO questionsPool;

    public QuizServiceImpl(QuestionDAO dao) {
        this.questionsPool = dao;
    }

    @Override
    public List<Question> getAllQuestions() {
        return this.questionsPool.getAll();
    }
}
