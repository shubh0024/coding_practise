package com.problems;

import java.util.Scanner;

public class prime_factorizaton {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        for(int div=2; div*div <= n; div++){
            while(n % div ==0){
                n= n / div;
                System.out.println(div+" ");
            }
        }
        if(n!=1){//for attempting to print the its 5becomes
            System.out.println(n);
        }
    }
}
