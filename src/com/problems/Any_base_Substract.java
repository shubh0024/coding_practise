package com.problems;

import java.util.Scanner;

public class Any_base_Substract {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int b=sc.nextInt(); //taking the base
        int n1=sc.nextInt(); //first number
        int n2= sc.nextInt(); //seconds number

        int ds=getsubsracton(b,n1,n2); //resturns ans from the function get subtracts
        System.out.println(ds);
    }
    public static int getsubsracton(int b, int n1,int n2){ //fucntion decalaratiom
        int rv=0;
        int carr=0;
        int pow=1;
        while( n2>0){
            int d1= n1 % 10;  //getting the last number to add digts at once
            n1=n1/10;   //slicng the  numbr
            int d2=n2 %10;
            n2=n2/10; //number slicing the greatest numeber

            int d=0;  //consider the new digits
            d2= d2 + carr;  //adding the carry to the digits


            if(d2>=d1){
                carr=0;
               d= d2-d1;
            }else{
                carr=-1;
               d=d2 + b -d1; //taking the carrying so taht adding the base
            }

            rv+= d * pow;  ///results value getting after the return
            pow=pow*10;  //attaing the lest most position


        }
        return rv;
    }
}
