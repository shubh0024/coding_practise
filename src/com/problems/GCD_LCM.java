package com.problems;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int rem = 0;
        int on1 = n1;//print the original number due to operation its becomes decrease
        int on2 = n2; //print the orginal number due to operation  its becomes derease
        while (n1 % n2 != 0) {
            rem = n1 % n2;
            n1=n2;
            n2=rem;

        }
        int gcd=n2;
        int lcm=(n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
