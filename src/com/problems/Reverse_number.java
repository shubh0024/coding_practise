package com.problems;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        while (n != 0) {
            int rem = n % 10;
             n=n/10;
            System.out.println(rem);
        }
    }
}

