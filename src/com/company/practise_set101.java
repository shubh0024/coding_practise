package com.company;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class practise_set101 {
    public static void main(String[] args) {
        ArrayList arr= new  ArrayList<>();
        arr.add("Shubham");
        arr.add("Shvamm");
        arr.add("Shuabam");
        arr.add("Shdam");
        arr.add("Shuddddddbham");
        arr.add("Shubhddfdff");
        arr.add("Shubhsfvb");
        arr.add("Shudfg");
        arr.add("Shubhaffgbm");
        arr.add("Shubhamfgb");
        arr.add("Shubhamfdgb");
//        for(int i=0; i<arr.size(); i++)
        for(Object o:arr)
        {
            System.out.println(o);
        }
     //ps q5

        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(53);
        s.add(533);
        s.add(542);
        s.add(52);
        s.add(45);
        s.add(15);
        s.add(135);
        System.out.println(s);


          //ps q1
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter df= DateTimeFormatter.ofPattern("h:m:s");
        String myDate= dt.format(df);
        System.out.println(myDate);


        //psq2
        Date d = new Date();
        System.out.println(d.getHours() +":"+d.getMinutes());
       //Calender
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" +c.get(Calendar.MINUTE) +":"+ c.get(Calendar.SECOND));
    }



}
