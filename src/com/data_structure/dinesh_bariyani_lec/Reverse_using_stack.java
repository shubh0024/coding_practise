package com.data_structure.dinesh_bariyani_lec;
import java.util.Stack;

public class Reverse_using_stack {
    public static String reverse(String str){
        Stack<Character> stack=new Stack<>();
        char[] chars = str.toCharArray();
        for(char c:chars){
            stack.push(c);
        }
        for(int i=0; i<str.length(); i++){
            chars[i]=stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str="Abxjhgf";
        System.out.println("before reverese"+str);
        System.out.println("after reversed"+reverse(str));

    }
}
