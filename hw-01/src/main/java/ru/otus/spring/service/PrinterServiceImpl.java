package ru.otus.spring.service;

public class PrinterServiceImpl implements PrinterService {
    @Override
    public void print(String line) {
        System.out.println(line);
    }
}
