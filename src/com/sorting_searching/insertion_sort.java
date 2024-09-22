package com.sorting_searching;

public class insertion_sort {
    public void printarray(int [] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 public void sort(int [] arr){ //unsorted part
        int n=arr.length;
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i- 1;//sorted part
            while(j >=0  && arr[j] > temp){
                arr[j+1]  = arr[j];
                j=j-1;
            }
            arr[j+1]= temp;
        }
 }
    public static void main(String[] args) {
    insertion_sort is=new insertion_sort();
    int [] arr=new int [] {3,4,7,2,1};
    is.printarray(arr);
        is.sort(arr);
        is.printarray(arr);
    }
}
