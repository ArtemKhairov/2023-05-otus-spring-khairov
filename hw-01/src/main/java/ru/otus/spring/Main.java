package ru.otus.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.service.ReaderService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        ReaderService readerService = context.getBean("readerService", ReaderService.class);
        readerService.startRead();
        context.close();
    }
}