package com.patterns;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number");
        int n=4;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
