package com.problems;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Rotate_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = n;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }
          k = k % nod;  //for the greater than the value required
          if (k < 0) {//save from the negative rotation
            k = k + nod;
        }
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) { //always move  less than the nmber from the requiredn number
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }
        int q = n / div; //slice the number into required rotataion  the and the divisor
        int req = n % div; //for giving the exact place by using hte multiplicaation method
        int rotatenum= req * mul + q; // stored the value of the multiplication and adding the sliced value
        System.out.println("the number whre to ratate"+nod); //printingthe count value 
        System.out.println(rotatenum);
    }

}
