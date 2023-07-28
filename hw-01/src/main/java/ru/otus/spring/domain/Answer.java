package ru.otus.spring.domain;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Answer {
    private final String answer;

    public String getAnswer() {
        return answer;
    }
}
