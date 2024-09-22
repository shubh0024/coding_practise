package com.patterns;

import java.util.Scanner;

public class tworight_triangle_middlespace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=2 * n-3;
        int st=1;
        int val=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=st; j++){
                System.out.print(val+"\t");
                val++;
            }
            for(int j=1; j<=sp; j++){
                System.out.print("-\t");
            }
            if(i==n){
                st--;
                val--;
            }
            for(int j=1; j<=st; j++){
                val--; //reduce it because it less than 4 in n-1 line
                System.out.print(val+"\t");
            }
            st++;
            sp-=2;
            System.out.println();
        }
    }
}
