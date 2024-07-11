package com.packtpub3.steps2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WeeklySteps {
    List<Steps> dailySteps = new ArrayList<>();
    DailyGoal dailyGoal;

    public List<Steps> getDailySteps() {
        return dailySteps;
    }

    public void setDailySteps(List<Steps> dailySteps) {
        this.dailySteps = dailySteps;
    }

    public DailyGoal getDailyGoal() {
        return dailyGoal;
    }

    public void setDailyGoal(DailyGoal dailyGoal) {
        this.dailyGoal = dailyGoal;
    }


    public DayOfWeek bestDay() {
        DayOfWeek best = DayOfWeek.MONDAY;
        int max = 0;

        for (Steps steps : dailySteps) {
            if (steps.getSteps() > max) {
                max = steps.getSteps();
                best = steps.getLocalDate().getDayOfWeek();
            }
        }
        return best;
    }

    public int getTotalSteps() {
        int total = 0;
        for (Steps steps: dailySteps) {
            total += steps.getSteps();
        }
        return total;

    }

    public String format() {
        StringBuilder builder = new StringBuilder();
        builder.append("Total steps: " + getTotalSteps() + "\n");
        for (Steps steps: dailySteps) {
            if (dailyGoal.hasMetGoal(steps)) {
                builder.append("YAY !! ");
            } else {
                builder.append(" try harder !! ");
            }
            builder.append(steps.getLocalDate().getDayOfWeek());
            builder.append(" ");
            builder.append(steps.getSteps());

            DayOfWeek best = bestDay();
            if (steps.getLocalDate().getDayOfWeek() == best) {
                builder.append(" **** BEST DAY !! ");
            }
            builder.append(" \n");
        }

        return builder.toString();
    }

    public void addDailySteps(int steps, LocalDate localDate) {
        dailySteps.add(new Steps(steps, localDate));
    }


    public static void main(String[] args) {
        DailyGoal dailyGoal = new DailyGoal(10000);
        WeeklySteps weeklySteps = new WeeklySteps();
        weeklySteps.setDailyGoal(dailyGoal);

        int year = 2023;
        int month = 5;
        int day = 15;

        weeklySteps.addDailySteps(11543, LocalDate.of(year, month, day));
        day++;
        weeklySteps.addDailySteps(12112, LocalDate.of(year, month, day));
        day++;
        weeklySteps.addDailySteps(10005, LocalDate.of(year, month, day));
        day++;
        weeklySteps.addDailySteps(9999, LocalDate.of(year, month, day));
        day++;
        weeklySteps.addDailySteps(20053, LocalDate.of(year, month, day));
        day++;
        weeklySteps.addDailySteps(20048, LocalDate.of(year, month, day));
        day++;

        System.out.println(weeklySteps.format());
    }
}
