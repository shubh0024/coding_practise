package com.company.Problems;

import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0; i < n; i++){
            int pN=sc.nextInt();
            for(int div=1; div<=n ;div++){
                if(pN % div==0){
                    count++;
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
