package com.ar.java8Methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatingAndParsingEx {
    public static void main(String[] args) {
        //Display Date User Friendly
        LocalDate localDate = LocalDate.now();
        System.out.println("Original Date: "+ localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY dd,MM");
        String userFriendlyDate = localDate.format(dateTimeFormatter);
        System.out.println(userFriendlyDate);

        String usFormat = "10/06/2023";
        DateTimeFormatter Usformatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date =  LocalDate.parse(usFormat, Usformatter);
        System.out.println(date);
    }
}
