package ru.otus.tests;
import ru.otus.spring.dao.CSVReaderDAO;
import ru.otus.spring.service.QuizServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Quiz Service Test")
public class QuizServiceTest {
    @DisplayName("Question file test")
    @Test
    void serviceTest() {
        CSVReaderDAO questionsPoolCSVReader = new CSVReaderDAO("questions.csv");
        QuizServiceImpl questionsService = new QuizServiceImpl(questionsPoolCSVReader);
        assertEquals(5, questionsService.getAllQuestions().size());

    }
}
