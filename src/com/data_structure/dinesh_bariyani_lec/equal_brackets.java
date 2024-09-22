package com.data_structure.dinesh_bariyani_lec;
import java.util.Stack;

public class equal_brackets {
    static Boolean isValid(String s){
        Stack<Character> stack=new Stack();
          for(char c:s.toCharArray()){
              if(c== '(' || c=='{' || c=='['){
                  stack.push(c);
              }else {
                  if(stack.isEmpty()){
                      return false;
                  }else {
                      char top=stack.peek();
                      if((c=='(' && top==')') || (c=='{' && top=='}') ||( c=='[' && top==']')){
                          stack.pop();

                      }else{
                          return false;
                      }
                  }
              }
          }return stack.empty();
    }

    public static void main(String[] args) {
        String s="({[]})";
        System.out.println("jkjhgxc"+s);
        System.out.println("result is \t"+isValid(s));
    }
}
