package com.problems;

import java.util.Scanner;

public class digits_frequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int searchdigit=sc.nextInt();
        int f=getDigtifrequency(n,searchdigit);
        System.out.println(f);
    }
    public static int getDigtifrequency(int n,int searchdigit){
        int rv=0;
        while(n>0){
            int digit= n % 10; //int will give the remainder
            n=n/10; //it will slice the number from the last number

            if(digit == searchdigit){
                rv++;
            }
        }
        return rv;
    }

}
