package com.patterns;

import java.util.Scanner;

public class Alphabet_W {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++) {
                if (j == 1 || j == n) {

                    System.out.print("W\t");
                }else if(i> n/2 && (( i== j )||( i+j == n+1))){
                    System.out.print("w\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
