package com.sorting_searching;

public class flag_problems {
    //Dutch national flag problems
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void flag_problems(int []arr){
        int i=0;
        int j=0;
        int k= arr.length-1;
        while(i<k){
            if(arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            } else if (arr[i]==1) {
                  i++;
            } else if (arr[i]==2) {
                swap(arr,i,k);
                k--;
            }
        }
    }
    public  void printarray(int [] arr){
        int n= arr.length;
       for(int i=0; i<arr.length; i++) {
           System.out.println(arr[i]+" ");

       }
        System.out.println();
    }

    public static void main(String[] args) {
        flag_problems fp = new flag_problems();
        int[] arr = new int[]{1,0,2,1,0,2,2};
        fp.flag_problems(arr);
        fp.printarray(arr);


    }
}
