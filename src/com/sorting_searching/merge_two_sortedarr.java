package com.sorting_searching;

public class merge_two_sortedarr {
    public int [] merge(int [] arr1,int [] arr2,int n,int m){
        int [] result=new int[n+m];//addig the arrr1 and arr2
        int i=0; int j=0; int k=0;
        while(i<n && j<m){ //boundary conditions
            if(arr1[i]<arr2[j]){ //if arr1 elelment at i is less than arr2 element at j
                result[k]=arr1[i];
                i++;
            }else{
                result[k]=arr2[j]; //storing the eleemnt into result
                j++;
            }
            k++;
        }
        while(i<n){  //array 2 is exhauasted frst
            result[k]=arr1[i]; //storing the arr1 into result
            i++; k++;
        }
        while(j<m){   //array one is exahausted frst
            result[k]=arr2[j]; //storing the arr2 element into result
            j++; k++;
        }
        return result;

    }
    public void printarray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        merge_two_sortedarr ms=new merge_two_sortedarr();
        int [] arr1={1,2,3};
        int [] arr2={4,5,6};

        ms.printarray(arr1);
        ms.printarray(arr2);
        int [] result =ms.merge(arr1,arr2, arr1.length, arr2.length);
        ms.printarray(result);
    }
}
