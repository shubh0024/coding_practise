package com.data_structure.Array_problems;

import java.util.Scanner;

public class subs_two_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2 array bnaye
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] diff = new int[n2];
        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;


        //store karwyae using the condition happens like agr  arr ke digit ke carry ko add krke or substract krke
        //3 condtion  lagayge 
        while (k >= 0) {
            int digits = 0; //store krayge result ko
            int arr1v = i >= 0 ? arr1[i]: 0; //condition work krega jab starting me arr1 me kuch v na ho dusre se kam digits ho


            if (arr2[j] + c >= arr1v) { //check kre ki arr2 ke elements arr1 ke sath with carry substract krwa paa rha hai ki nahi
                digits = arr2[j] + c- arr1v;
                c = 0;
            } else {
                digits = arr2[j] + c + 10 - arr1v;
                c = -1;
            }
            diff[k] = digits; ///digit ko store krayge

            i--; //sare ke last index se pahle ki or jayge
            j--;
            k--;
        }
        int idx = 0; //check krenge ki index se pahle se zero to ni aa rhi hai
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        while (idx < diff.length) { //answer ko print krayge
            System.out.println(diff[idx]);
            idx++;

        }
    }
}