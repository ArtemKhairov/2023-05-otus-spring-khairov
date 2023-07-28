package ru.otus.spring.service;

import ru.otus.spring.domain.Question;

import java.util.List;

public class QuestionServiceImpl implements QuestionService {
    private final QuizService quizService;

    private final PrinterService printerService;

    public QuestionServiceImpl(QuizService quizService, PrinterService printerService) {
        this.quizService = quizService;
        this.printerService = printerService;
    }

    @Override
    public void printQuestions() {
        List<Question> questions = quizService.getAllQuestions();
        for (Question question : questions) {
            printerService.print(question.getQuestion());
            printerService.print(question.getAnswer().getAnswer());
        }
    }
}
