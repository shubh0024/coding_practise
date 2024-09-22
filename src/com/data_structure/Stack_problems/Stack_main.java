package com.data_structure.Stack_problems;
import java.util.*;

public class Stack_main {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.pop();
        st.peek();
        st.pop();
        st.push(10);
        System.out.println(st);
        System.out.println(st.peek()+" "+st.size());
        System.out.println(st.search(3)+ "  element at ");
        System.out.println(st.search(5));
        System.out.println(st.search(2)+ "  element at ");
        System.out.println(st.search(1)+ "  element at ");
    }
}
