package com.patterns;

import java.util.Scanner;

public class Barchart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i]; //arry ke elements ko compare krake maximum me dal do or max ko print kra do upar se
            }
        }
        for(int floor=max; floor>=1; floor--){ //max ko floor me assign krke pointer chalado
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
