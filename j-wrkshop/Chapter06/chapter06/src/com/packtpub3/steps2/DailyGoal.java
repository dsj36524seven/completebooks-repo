package com.packtpub3.steps2;

public class DailyGoal {
    int dailyGaol = 10000;


    public DailyGoal(int dailyGaol) {
        this.dailyGaol = dailyGaol;
    }


    public boolean hasMetGoal(Steps steps) {
        if (steps.getSteps() >= dailyGaol) {
            return true;
        }
            return false;
    }
}
