package com.problems;

import java.util.Scanner;

public class Any_baseto_Anybase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();

        int dn=getanybasetAnybase(n,b1,b2);
        System.out.println(dn);

    }
    public static int getanybasetAnybase(int n,int b1,int b2){
        int dec=getbasetoDecimal(n,b1);
        int destnum=getdecimaltobase(dec,b2);

        return destnum;
  ///convert number into anybase to anybase

    }
    //convert anydeimal to base
    public static int getdecimaltobase(int n,int b){
        int rv=0;
        int pow=1;

        while(n>0){
            int rem=n % b;
            n=n / b;

            rv+= rem * pow;
            pow=pow*10; //jab base me decimal se karna ho to 10 se multiply krte hai
        }

        return rv;

    }
    //convert base
    public static int getbasetoDecimal(int n,int b){
        int rv=0;
        int pow=1;

        while(n>0){
            int rem=n%10;
              n = n / 10;

            rv+= rem* pow;
            pow=pow * b;


        }
        return rv;
    }
}
