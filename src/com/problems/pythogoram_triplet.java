package com.problems;

import java.util.Scanner;

public class pythogoram_triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        int hyp=n1;
        if(n2>=hyp){
            hyp=n2;
        }
        if(n3>=hyp){
            hyp=n3;
        }

        if(hyp==n1){
            boolean flag=((n2*n2 + n3*n3) ==( n1*n1));//boolean falg will give true or false
            System.out.println(flag);
        }else if(hyp==n2){
            boolean flag=((n1*n1 + n3*n3)==(n2*n2));
            System.out.println(flag);
        }else{
            boolean flag=((n1*n1 + n2*n2)==(n3*n3));
            System.out.println(flag);

        }
    }
}
