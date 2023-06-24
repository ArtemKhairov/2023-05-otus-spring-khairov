package ru.otus.spring.service;

import ru.otus.spring.domain.Question;

import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    private final QuizService quizService;
    private final PrinterService printerService;

    public ReaderServiceImpl(QuizService quizService, PrinterService printerService) {
        this.quizService = quizService;
        this.printerService = printerService;
    }

    @Override
    public void startRead() {
        List<Question> questions = quizService.getAllQuestions();
        for (Question question : questions) {
            printerService.print(question.getQuestion());
            printerService.print(question.getAnswer().getAnswer());
        }
    }
}
