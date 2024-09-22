package com.data_structure.Stack_problems;

import java.util.Scanner;
import java.util.*;

public class balanced_brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') { //jab tk opening brackets aayge tb tk push hoga i se close bracket tk
                st.push(ch);
            } else if (ch == ')') {
                     boolean val= handleClosing(st,'(');
                     if(val== false){
                         System.out.println(false);
                         return;
                     }

            } else if (ch == '}') {
                boolean val= handleClosing(st,'{');
                if(val== false){
                    System.out.println(false);
                    return;
                }

            } else if (ch == ']') {
              handleClosing(st,'[');
            }
        }
        if(st.size()==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }


    public static boolean handleClosing(Stack<Character> st,char corresopch) {
        if (st.size() == 0) {
            System.out.println(false);
        } else if (st.peek() != corresopch) {
            System.out.println(false);
        } else {
            st.pop();

        }
        return true;
    }
}
