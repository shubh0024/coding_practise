package com.patterns;

import java.util.Scanner;

public class cross_patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n ; j++){
                if(i==j || i+j == n+1){ //for both the diagonal
                    System.out.print("8\t");
                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
