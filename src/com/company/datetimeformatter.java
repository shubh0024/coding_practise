package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt1= LocalDateTime.now();

        System.out.println(dt1);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy--E a H:m  " );
//        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt1.format(df);
        System.out.println(myDate);
        System.out.println(dt1.getMonthValue());
    }
}
