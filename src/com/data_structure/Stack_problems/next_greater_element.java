package com.data_structure.Stack_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class next_greater_element {
    public static void display(int[] a){
        StringBuilder sb=new StringBuilder();

        for(int val: a){
            sb.append(val+'\n');

        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  //nge=next greater element  st=stack name
        int n=Integer.parseInt(br.readLine());
        int [] a=new int[n];
        for(int i=0; i<a.length; i++){
//            a[i] =Integer.parseInt(br.readLine());
             a[i]=Integer.parseInt(br.readLine());
         }
        int[] nge=solve(a);
        display(nge);
    }
    public static int[] solve(int [] arr){
        int [] nge=new int[arr.length];
         Stack<Integer> st =new Stack<>();
         st.push(arr[arr.length-1]);
         nge[arr.length-1]=-1;
         for(int i=arr.length-2; i>=0; i--){
             //a+
             while(st.size()>0 && arr[i]>= st.peek()){
                 st.pop();
             }
             if(st.size()==0){
                 nge[i]=-1;

             }else{
                 nge[i]=st.peek();
             }
             st.push(arr[i]);
         }

         return nge;
    }
}
