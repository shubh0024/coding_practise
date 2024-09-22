package com.data_structure.Stack_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class practice {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String exp = br.readLine();

        Stack<Integer> vs = new Stack<>();
//        Stack<String> is=new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            System.out.println(ch);

            while (!vs.isEmpty()) {
                if (ch == '+') {

                    int v2 = vs.pop();
                    int v1 = vs.pop();
                    int val = operation(v1,v2,ch); //function for the perform operation
                    vs.push(val); //pushing the value of the sum of the op to stack
                    vs.push(ch-'0');

                }
            }
        }
        System.out.println(vs.pop());
    }
    public static int operation(int v1,int v2,char ch){
        if(ch=='+'){
            return v1 + v2;
        }
        return 0;
    }
}
