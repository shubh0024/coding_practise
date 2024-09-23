package com.problems;

import java.util.Scanner;

public class fibonacci_series_recursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int fibn=fibonacci(n);
        System.out.println("hello"+fibn);
    }
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        int fibn=fibonacci(n-1) + fibonacci(n-2);

        return fibn;
    }

     public static int fiboMemoized(int n,int [] qb){
        if(n==0 || n==1){
            return n;
        }

        if(qb[n]!=0){
            return qb[n];
        }
         System.out.println("hello"+n);
        int fibnm1=fiboMemoized(n-1,qb) ;
         int fibnmn2=fiboMemoized(n-2,qb);

         int fibn=fibnm1+fibnmn2;

        qb[n]=fibn;

        return fibn;
    }





    }
