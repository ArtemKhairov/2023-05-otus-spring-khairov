package ru.otus.tests;

import ru.otus.spring.dao.CSVReaderDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("CSVReaderDAOTest")
public class CSVReaderDAOTest {
    private static final int QUESTIONS_COUNT = 5;

    private static final String EXIST_FILE = "questions.csv";

    private static final String NOT_EXIST = "not-exist-file.csv";

    @DisplayName("Test with Existing File")
    @Test
    void existFileTest() {
        var questionsDao = new CSVReaderDAO(EXIST_FILE);
        var questions = questionsDao.getAll();
        assertEquals(QUESTIONS_COUNT, questions.size());
    }

    @DisplayName("Test with Non existent file")
    @Test
    void nonExistentFileTest() {
        var questionsDao = new CSVReaderDAO(NOT_EXIST);
        var ex = assertThrows(RuntimeException.class, questionsDao::getAll);
        assertEquals(String.format("Could not open questions file"), ex.getMessage());
    }


}
