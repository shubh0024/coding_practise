package com.sorting_searching;

public class linear_search {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 71, 112, 43};
        int i=0,search=5;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==search){
                System.out.println("element is found at"+i);

            }else {
                System.out.println("npt found");
            }

        }

    }
}
