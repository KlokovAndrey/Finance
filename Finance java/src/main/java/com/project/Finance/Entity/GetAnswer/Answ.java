package com.project.Finance.Entity.GetAnswer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Answ {
    public Answer[] answers;

    public Answ() {
    }

    public Answ(Answer[] answers) {
        this.answers = answers;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }
}
