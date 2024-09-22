package com.data_structure.dinesh_bariyani_lec;

public class resize_array {
    public void printarray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
public int[] resize(int[] arr, int capacity){
        int [] temp = new int[capacity];
        for(int i=0; i<arr.length; i++){
            temp[i] =arr[i];
        }
arr=temp;
 return arr;
 //we can also return the temp to direct refer the last intialisiation of the arrayu
}
    public static void main(String[] args) {
//        int [] arr= {2,3,5,6,7,7,2,45,443,3};
        resize_array rs = new resize_array();
//        rs.printarray(arr);
        int [] orginal =new int[] {5,73,2,4,4,32,2};
        System.out.println("the size of the originl array"+ orginal.length);
        orginal= rs.resize(orginal,10);
        System.out.println("the size of the original aray"+ orginal.length);
    }
}
