package com.sorting_searching;

import com.sun.source.tree.WhileLoopTree;

public class searchinsert {
    public int search(int [] arr,int target){
        int low =0;
        int high =arr.length-1;
        while(low < high){
            int mid =low = (high-low)/2;
            if(arr[mid] == target){
                return  mid;
            }
            if(low < arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return low;//it will return the actual traget value
        // discarding half of the array running time is logn
    }
}
