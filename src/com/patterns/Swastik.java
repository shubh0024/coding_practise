package com.patterns;

import java.util.Scanner;

public class Swastik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1){
                   if(j==n || j<=n/2 + 1){
                       System.out.print("*\t");
                   }else{
                       System.out.print("\t");
                   }
                }else if(i<= n/2){ //2or 3

                    if(j==n || j== n/2 + 1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }else if(i == n/2 + 1 ){  //4th
                        System.out.print("*\t");

                }

                else if(i<n){ //5th or 6th row

                    if(j==1 || j== n/2 + 1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }

                }
                else{
                    if(j==1 || j>= n/2 + 1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }


                }

            }
            System.out.println();
        }
    }
}
