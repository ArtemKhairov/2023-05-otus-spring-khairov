package ru.otus.spring.service;

import org.springframework.stereotype.Service;

@Service
public class PrinterServiceImpl implements PrinterService {
    @Override
    public void print(String line) {
        System.out.println(line);
    }
}
