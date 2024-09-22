package com.data_structure.Stack_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Largest_Area_histogram {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //taking the array ={6,2,5,4,5,1,6}
     ///lt the input n be 7
        int n=Integer.parseInt(br.readLine());
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
  //taking the right boundary for the element
        int [] rb=new int[arr.length]; //taking 7 as right boundary
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1); //taking the pushed first element index is 6
        rb[arr.length-1]=arr.length;

        for(int i=arr.length-2; i>=0; i--){
            while(st.size()>0 && arr[i]<arr[st.peek()]){
                st.pop(); //it will pop the element which is at the index 6 which is 6
            }
            if(st.size()==0){
                rb[i]=arr.length;
            }else{
                rb[i]=st.peek(); 
            }
            st.push(i); //push the element next element
        }

        //taking the left boundary for the element
        int [] lb=new int[arr.length];
        st=new Stack<>();
        st.push(0);
        lb[0]=-1; //its is less than 0 so that -1

        for(int i=1; i<arr.length; i++){
            while(st.size() >0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                lb[i]= -1;
            }else{
                lb[i]=st.peek();

            }
            st.push(i);
        }
        //now finding the max area

        int maxarea=0;
        for(int i=0; i<arr.length; i++){
            int width= rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            if(area > maxarea){
                maxarea=area;
            }
        }
        System.out.println(maxarea);
    }
}
