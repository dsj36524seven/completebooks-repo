package com.packtpub3.steps2;

import java.time.LocalDate;


public class Steps {
    private int steps;
    private LocalDate localDate;


    //Constructors
    public Steps(int steps, LocalDate localDate) {
        this.steps = steps;
        this.localDate = localDate;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
