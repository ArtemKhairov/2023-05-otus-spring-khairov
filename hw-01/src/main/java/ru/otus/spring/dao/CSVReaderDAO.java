package ru.otus.spring.dao;

import ru.otus.spring.domain.Answer;
import ru.otus.spring.domain.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;
import java.util.Scanner;

public class CSVReaderDAO implements QuestionDAO {
    private final String file;

    public CSVReaderDAO(final String file) {
        this.file = file;
    }

    @Override
    public List<Question> getAll() {
        try {
            InputStream inputStream = CSVReaderDAO.class.getClassLoader().getResourceAsStream(file);
            Scanner scanner = new Scanner(inputStream);
            List<Question> questions = readQuestions(scanner);
            scanner.close();
            inputStream.close();
            return questions;
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }

    private List<Question> readQuestions(Scanner scanner) {
        List<Question> questions = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            Answer answer = new Answer(columns[1]);
            Question question = new Question(columns[0], answer);
            questions.add(question);
        }
        return questions;
    }

}
