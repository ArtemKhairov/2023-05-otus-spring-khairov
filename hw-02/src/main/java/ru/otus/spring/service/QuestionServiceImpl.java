package ru.otus.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.otus.spring.domain.Question;

import java.util.List;

@Component
//@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuizService quizService;

    private final PrinterService printerService;

    @Autowired
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
