package com.problems;

import java.util.Scanner;

public class NUmber_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n= sc.nextInt();
         int b=sc.nextInt();

         //(634)base10=(base)8
//        decimal to base

        int dn=getValue(n,b);
        System.out.println(dn);
    }
    public static int getValue(int n, int b){
        int rv=0;
        int pow=1;
        while(n>0){
            int carr=n%b;
            n=n/b; //always try to divide the result with base to get the remaining the eauation of the resultant number

            rv= rv+carr* pow;
            pow=pow*10;


        }

     return rv;
    }
}
