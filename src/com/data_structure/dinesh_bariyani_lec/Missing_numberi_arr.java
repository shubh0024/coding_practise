package com.data_structure.dinesh_bariyani_lec;

public class Missing_numberi_arr {
    public void printarray(int [] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int findmissig(int[]arr){
        int n = arr.length +1;
        int sum = n*(n+1) / 2;
        for(int num:arr){
            sum = sum -num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr={3,4,5,1,2,7};
        Missing_numberi_arr msa = new Missing_numberi_arr();
        msa.printarray(arr);
        System.out.println(findmissig(arr));
    }
}
