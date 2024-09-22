package com.patterns;

import java.util.Scanner;

public class fibanacci_pattrns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int value1=0;
        int value2=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((value1)+" ");
                int value=value1 + value2;
                value1=value2;
                value2=value;
            }
            System.out.println();
        }

    }
}
