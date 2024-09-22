package com.problems;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int range=sc.nextInt();

        for(int i=0; i < range; i++){
            int number=sc.nextInt();

            int count=0;
            for(int div=1; div * div<=range; div++){
                if(number % div ==0){
                    count++;
                    break;
                }
            }
            if(count == 2){
                System.out.println("prime no");
            }else{
                System.out.println("not prime");
            }
        }

    }
}
