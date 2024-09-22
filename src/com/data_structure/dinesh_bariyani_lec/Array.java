package com.data_structure.dinesh_bariyani_lec;

import java.util.Scanner;

public class  Array {
//
//    public void printarray(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public void arrayDemo(){
//        int [] Array1 = {6,7,8,9,3};
//
//        printarray(Array1);
//        System.out.println(Array1[Array1.length - 4]);
//    }

    public static int firstIndex(int[] arr, int idx, int x) {

        if (idx == arr.length) {
            return -1;
        }

        int fiisa = firstIndex(arr, idx + 1, x);

        if (arr[idx] == x) {
            return idx;
        } else {
            return fiisa;
        }
    }

    public static int lastindex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }

        int liisa = lastindex(arr, idx + 1, x);

        if (liisa == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return liisa;
        }
    }


//    public static int Allindices(int[] arr, int x, int idx, int fsf) {
//        if (idx == arr.length) {
//            return new int[fsf];
//        }
//        if (arr[idx] == x) {
//            int[] iarr = Allidices(arr, x, idx + 1, fsf + 1);
//            iarr[fsf] = idx;
//            return iarr;
//
//        } else {
//            int[] arr = Allindices(arr, x, idx + 1, fsf);
//            return iarr;
//        }
//
//    }



    public static void main(String[] args) throws Exception{

//
//        Array arr =new Array();
//        arr.printarray(new int[] {5,6,7,4,3,21,55});

        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int d= sc.nextInt();

       int fi= firstIndex(arr,0,d);
        System.out.println("first index dekhlo"+fi);

        int li=lastindex(arr,0,d);
        System.out.println("Last index dekhlo"+li);

//        int iarr=Allindices(arr,x,0,0);
    }
    }
