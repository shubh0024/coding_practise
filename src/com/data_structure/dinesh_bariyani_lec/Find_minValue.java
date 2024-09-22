package com.data_structure.dinesh_bariyani_lec;

public class Find_minValue {
    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public int Findmin(int[] arr) {
        if(arr == null || arr.length==0){
            throw new IllegalArgumentException("invalid input");

        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]<min){
              min = arr[i];
          }
        }return min;
    }


    //second minimum for the array
     int find(int [] arr){
        int Max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length; i++){
            if(arr[i] > Max){
                secondMax =Max;
                Max=arr[i];
            }else if(arr[i] > secondMax && arr[i] != Max){
                secondMax= arr[i];            }
        }return secondMax;
    }
    public void moveZeros(int [] arr,int n){
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] !=0 && arr[j]==0){
               int temp = arr[i];
               arr[i]=arr[j];
               arr[j]= temp;
               i++;
            }
            if (arr[j] !=0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr= {4,656,0,43,3,22,56,0,466,422};
        Find_minValue fm = new Find_minValue();
        System.out.println(fm.Findmin(arr));
        System.out.println(fm.find(arr));
        //moving zeros wtih
        Find_minValue mZ = new Find_minValue();
        mZ.moveZeros(arr, arr.length-1);
       printarray(arr);
    }
}
