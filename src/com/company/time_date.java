package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter;
public class time_date {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()/1000/3600/24);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
//        System.out.print("ms");
//
//        Date d= new Date();
//        System.out.println(d);
        //example 1
        LocalDate d2=  LocalDate.now();
        String d2str= d2.format(DateTimeFormatter.ISO_DATE);
        System.out.println("date in string "+ d2str);


        //example 2
        LocalDate d3= LocalDate.of(2002,05,01);
        String d3str=d3.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date2 is string "+d3str);

        //Example 3
        LocalDate d4= LocalDate.of(2016,11,01);
        String d4str= d4.format(DateTimeFormatter.ISO_DATE);
        System.out.println("date3 is string "+d4str);
    }
}
