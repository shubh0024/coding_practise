package com.data_structure.dinesh_bariyani_lec;


import static java.lang.System.currentTimeMillis;

public class Time_complexity {

//public int findSum(int n){
// return n* (n+1) /2;
//}
    public int findSum(int n) {
        int sum = 0;
        for(int i=0; i<n; i++){
            sum=sum + i;
        }
        return sum;
    }


    public static void main(String[] args) {
        double now = currentTimeMillis();

        Time_complexity demo = new Time_complexity();
        System.out.println(demo.findSum(99999));
        System.out.println("Time taken -" + (currentTimeMillis() - now) + "milisecs");
    }
}
