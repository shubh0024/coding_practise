package com.patterns;

public class hollowdiamond_square {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");//star
            }
            for (int j = 1; j <=( 2 * i - 2); j++) {
                System.out.print(" ");//space
            }
            for (int j =i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        //loop for printing lower half part  of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");//print star
            }
            for (int j = (2 * i - 2); j < (2 * n - 2); j++) {
                System.out.print(" ");//print space
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");//move to next line
        }
    }
}


