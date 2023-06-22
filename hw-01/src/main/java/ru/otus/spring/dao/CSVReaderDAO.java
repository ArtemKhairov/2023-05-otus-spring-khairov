package ru.otus.spring.dao;

import ru.otus.spring.domain.Question;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;
import java.util.Scanner;

public class CSVReaderDAO implements QuestionDAO {
    private final String file;

    public CSVReaderDAO(final String file) {
        this.file = file;
    }

    private List<Question> readQuestions(Scanner scanner) {
        List<Question> questions = new ArrayList<>();
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            // Делаем разбиение строки на поля (предполагая, что они разделены запятой)
            String[] fields = line.split(",");
            System.out.println(fields);
            // Обрабатываем поля CSV-файла
            // ...
        }
        return null;
    }

    @Override
    public List<Question> getAll() {
        Scanner scanner = null;
        try {
            InputStream stream = getClass().getResourceAsStream(file);
            scanner = new Scanner(stream);
//            System.out.println(scanner);
            this.readQuestions(scanner);

            // Читаем строки CSV-файла и обрабатываем их


            // Закрываем Scanner и входной поток
            scanner.close();
            stream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }

}
