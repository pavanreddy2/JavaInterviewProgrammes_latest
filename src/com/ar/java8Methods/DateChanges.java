package com.ar.java8Methods;

import java.time.LocalDate;
import java.util.Date;

public class DateChanges {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Original Date:"+ date);

        //Modify the Date
        date.setYear(2025 - 2000);
        System.out.println("Modified Date: "+ date);
        System.out.println("java 8");
        LocalDate localDate = LocalDate.now();
        System.out.println("Original LocalDateTime: "+ localDate);

        LocalDate modifiedDate = localDate.minusYears(2);
        System.out.println("Modified LocalDate: "+ modifiedDate);
        System.out.println("Original Date after Modification: "+ localDate);
    }
}
