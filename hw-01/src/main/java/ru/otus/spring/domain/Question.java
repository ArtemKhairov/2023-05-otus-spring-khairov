package ru.otus.spring.domain;

import lombok.Data;
import lombok.AllArgsConstructor;

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
