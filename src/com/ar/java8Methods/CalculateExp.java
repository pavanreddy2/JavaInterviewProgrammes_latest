package com.ar.java8Methods;

import java.time.LocalDate;
import java.time.Period;

public class CalculateExp {
    public static void main(String[] args) {
        LocalDate startingDate =  LocalDate.of(1995,8,20);
        LocalDate stillDate = LocalDate.now();

        Period experience = Period.between(startingDate, stillDate);
        int years = experience.getYears();
        int months = experience.getMonths();

        System.out.printf("Total Experience: "+ "%d years, %d months", years,months);
    }
}
