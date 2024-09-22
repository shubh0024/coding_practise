package com.data_structure.Stack_problems;

import java.util.Scanner;
import java.util.Stack;

public class brackets_problems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> st=new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println(true);
                    return ;
                }else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop(); //its pop the last element of the stack
                }
            }else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}
