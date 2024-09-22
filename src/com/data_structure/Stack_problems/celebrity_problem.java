package com.data_structure.Stack_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class celebrity_problem {
    public static void main(String[] args)throws  Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        int [][] arr=new int[n][n];

        for(int i=0; i<n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j) - '0'; //slect ch variable at ch and get the intger
            }
        }
        findcelebraty(arr);

    }
    public static void findcelebraty(int [   ][] arr){

        //if teh celebrity is there print its index (not position),if there
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<arr.length; i++){
            st.push(i);

        }
        while(st.size() >= 2){

            int i=st.pop();
            int j=st.pop();

            if(arr[i][j]==1){
                //if i knows j->i is not celebrity
                st.push(j);
            }else{
                //if i doesnot know j-> j is not celebrity
                st.push(i);
            }
        }
      //lST VALA BNDA potential hai usko chek kro
     int pot=st.pop();
        for(int i=0 ; i<arr.length; i++){
            if(i!=pot){
                if(arr[i][pot]==0 || arr[pot][i]==1){
                    System.out.println("none");
                    return;
                }
            }
        }
        System.out.println(pot);

    }
}
