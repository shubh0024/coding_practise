package com.patterns;

import java.util.Scanner;

public class diagnal_rightside {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j==n+1){ //check wether the sum of i and j is equal than the nmber of the square print
                    System.out.print("diagonal\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
