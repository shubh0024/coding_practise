package com.patterns;

import java.util.Scanner;

public class hollowtriangle_mirror {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int st=n;
        int sp=0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < st) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if(i<=n/2){
                st-=2;
                sp++;
            }
            else{
                st+=2;
                sp--;
            }
            System.out.println();
        }
    }

}
