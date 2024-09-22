package com.data_structure.dinesh_bariyani_lec;

public class Revrse_Array {

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }


    public static  void reverse(int[] arr,int start,int end){
        while(start <end){
            int temp =  arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int [] arr = {3,56,7,78,833,12,22,4};
        printarray(arr);
        reverse(arr,0,arr.length-1);
        printarray(arr);
    }
}
