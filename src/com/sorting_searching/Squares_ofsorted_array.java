package com.sorting_searching;

public class Squares_ofsorted_array {
    public static  int[] sortedarray(int [] arr){
        int i=0;
        int n=arr.length;
        int j=n-1;
        int [] result=new int[n];

        for(int k=n-1; k>0; k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k]=arr[i]*arr[i];
                i++;
            }else{
                result[k]=arr[j]*arr[j];
                j--;
            }
        }
       return result;
    }
    public void printarray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int [] arr={-4,-1,0,3,10};
        int[] result=sortedarray(arr);
        printarray(result);
    }
    public static void main(String[] args) {
        Squares_ofsorted_array sq=new Squares_ofsorted_array();
        sq.arrayDemo();
    }
}
