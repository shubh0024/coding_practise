package com.problems;

import java.util.Scanner;
 //any base to decimal
// (1172)10=(base)2,(base)8
public class Anybase_todecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int dn = getvalueofbase(n, b);
        System.out.println(dn);
    }
    public static int getvalueofbase(int n, int b){
        int rv=0;
        int pow=1;

        while(n>0){
            int rem=n%10;
            n=n/10;

            rv+= rem* pow; //multiply with thier carry and add with old result to get the base
           pow= pow* b;
        }
        return rv;
    }
}
