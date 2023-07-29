package ru.otus.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Question {
    private final String question;

    private final Answer answer;

    public String getQuestion() {
        return question;
    }

    public Answer getAnswer() {
        return answer;
    }
}
