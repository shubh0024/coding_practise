package com.sorting_searching;

public class Quick_sort {
    public int partition(int [] arr,int low,int high){
        int i=low;
        int j=low;

        int pivot=arr[high];
        while(i<=high){
            if(arr[i]<=pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j-1;
        }
        public void sort(int[]arr,int low,int high){
        if(low < high){
            int p=partition(arr, low, high);
            sort(arr,low,(p-1));
            sort(arr,p+1,high);
        }
        }
        public void print(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
            System.out.println();
        }

    public static void main(String[] args) {
        Quick_sort qs=new Quick_sort();
        int [] arr= { 3,23,2,4,5,1};
        qs.sort(arr,0, arr.length-1);
        qs.print(arr);
    }
    }

