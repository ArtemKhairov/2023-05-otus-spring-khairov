package ru.otus.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.otus.spring.config.AppConfig;
import ru.otus.spring.dao.CSVReaderDAO;
import ru.otus.spring.service.QuizService;

@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
//        System.out.println(context);
//        System.out.println(context.getBean(AppConfig.class));
//        CSVReaderDAO reader = new CSVReaderDAO();
    }
}
