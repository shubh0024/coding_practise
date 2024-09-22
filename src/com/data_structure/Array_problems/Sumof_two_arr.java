package com.data_structure.Array_problems;

import java.util.Scanner;

public class Sumof_two_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int [] arr1=new int [n1];
        for(int i=0; i<arr1.length; i++)
        {
            System.out.println("arr1 ");
            arr1[i]=sc.nextInt();
        }

        int n2=sc.nextInt();
        int [] arr2=new int[n2];
        for(int i=0; i<arr2.length; i++){
            System.out.println("arr2 ");
            arr2[i]=sc.nextInt();
        }

        int [] sum=new int[n1 > n2 ? n1 : n2]; //ternary operator for the easily getting the true or false fr statement
        int c=0;

        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;

        while(k>=0){ //sum ke equal chalaye ho
            int digit=c;

            if(i>=0){
                digit+=arr1[i];
            }
            if(j>=0){
                digit+=arr2[j];
            }

            c= digit / 10; //jab v digits ko divide krenge to wo left most ko as carry lekr add krega next me
            digit= digit % 10; //ye remainder print karwayga

            sum[k] = digit;

            i--;
            j--;
            k--;

        }
        if(c!=0){
            System.out.println(c);
        }
        for(int val:sum){ //ye direct print kar dega val of the sum upto index
            System.out.println(val);
        }

    }

}
