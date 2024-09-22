package com.data_structure.Stack_problems;

import java.util.Scanner;
import java.util.Stack;

public class baalanced_brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();

        Stack<Character> st =new Stack<>();
        for(int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }else if(ch==')'){

                 Boolean val=handleClosing(st,'(');
                 if(val== false){
                     System.out.println(false);
                     return;
                 }
            }else if(ch=='}'){
                Boolean val=handleClosing(st,'{');

                if(val== false){         //ye v check krenge ki value jo aar hi hai false hai to print kar denge nhi to true
                    System.out.println(false);
                    return;
                }
            } else if (ch==']') {
                Boolean val=handleClosing(st,'['); //jAISE hi close bracket aayga toh phir  check krenge ki andar khali to nahi hai or also ki equal hai ki nahi
                if(val== false){
                    System.out.println(false);
                    return;
                }
            }else{

            }
        }
        if(st.size()==0){
            System.out.println(true);  //stack size khali hai toh true
        }else{
            System.out.println(false);
        }
    }
    public static boolean handleClosing(Stack<Character> st,char coresopch){//jp pass ho rha hoga
        if(st.size()==0){
            System.out.println(false);
            return false;
        }else if(st.peek()!=coresopch){
            System.out.println(false);
        }else {
            st.pop();
        }
        return false;
    }

}
