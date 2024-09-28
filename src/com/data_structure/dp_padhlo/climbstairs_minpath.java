package com.data_structure.dp_padhlo;

import java.util.Scanner;

public class climbstairs_minpath {
    public static void main(String[] args) {
        //arr minpath{3,2,4,2,0,2,3,1,2,2}
        //dp{0,1,2,3,4,5,6,7,8,9,10}

        //small int inbydefault it contain 4k at index and contain 0
        //large Integer Ii=5 In this it contain the direct addres at index 4k which contain 5 previously it contain null

        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();

        int [] arr = new int [n];
        for(int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();

        }

        Integer [] dp=new Integer[n+1];
        dp[n]=0;

        for(int i=n-1; i>=0; i--){
            if(arr[i]>0){
                int min=Integer.MAX_VALUE;

                for(int j=1; j<=arr[i] && i+j<dp.length; j++){
                    if(dp[i+j] !=null){//jaha pe null na pada ho
                        min=Math.min(min,dp[i+j]); //find the min value
                    }
                }

                //for the loop to be stop in the bound of array
                if(min!=Integer.MAX_VALUE){
                    dp[i]=min+1;
                }
            }
        }
        System.out.println(dp[0]);
    }
}
