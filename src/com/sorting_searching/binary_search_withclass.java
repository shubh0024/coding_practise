package com.sorting_searching;

public class binary_search_withclass {
    public int binaryserch(int [] nums,int key){
        int low=0;
        int high=nums.length-1;
        while(low <=high){
            int mid = (low +high)/2;
            if(nums[mid]== key){
                return mid;
            }
            if(key < nums[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return -1;
    }

    public static void main(String[] args) {
        binary_search_withclass  bs=new binary_search_withclass();
        int [] nums= {2,4,5,6,75,4,3};
        System.out.println(bs.binaryserch(nums,4));
    }
}
