package com.data_structure.Array_problems;

import java.util.Scanner;

public class arr_search_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];


        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        int idx=-1;
        int search=sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i]==search){
                idx=i;
                break;
            }
        }
        System.out.println(idx);


    }

}
