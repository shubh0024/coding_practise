package com.sorting_searching;

public class binary_search {
    public static void main(String[] args) {
        int [] arr={4,5,6,12,33};
        int low=0;
        int high =arr.length-1;
        int search=33;
        while(low <= high){
            int mid=(low + high)/2;
            if(arr[mid]==search){
                System.out.println(mid+" found");
            }
            if(search < arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
    }


}
