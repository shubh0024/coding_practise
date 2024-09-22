package com.problems;

import java.util.Scanner;

public class target_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        printTargetsum(arr,0,"",0,tar);

    }
    public static void printTargetsum(int [] arr,int idx,String set,int sos,int tar){

        if(idx==arr.length){
            if(sos==tar){
                System.out.println(set+",");
            }
            return ;
        }

        printTargetsum(arr,idx+1,set+ arr[idx]+ "," , sos+arr[idx] , tar);
        printTargetsum(arr,idx+1,set,sos,tar);
    }
}
