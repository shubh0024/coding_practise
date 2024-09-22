package com.sorting_searching;

public class selection_sort {
    public void printarray(int [] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public void selection(int[]arr){
        int n= arr.length;
        for(int i=0; i < n-1; i++){
            int min=i;
            for(int j= i + 1; j< n; j++){
                if(arr[j] < arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        selection_sort ss=new selection_sort();
        int [] arr= new int[]{2,34,5,6,74,4};
        ss.selection(arr);
        ss.printarray(arr);
    }
}
