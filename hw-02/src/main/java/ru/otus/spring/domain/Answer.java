package ru.otus.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Answer {
    private final String answer;

    public String getAnswer() {
        return answer;
    }
}
