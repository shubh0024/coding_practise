package com.data_structure.Stack_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class potfix_toInfix_prefix {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String exp = br.readLine();

        Stack<Integer> Vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);


                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    int v2 = Vs.pop();
                    int v1 = Vs.pop();
                    int val = operation(v1, v2, ch); //function for the perform operation
                    Vs.push(val); //pushing the value of the sum of the op to stack

                    String iv2 = is.pop();
                    String iv1 = is.pop();
                    String ival = "(" + iv1 + ch + iv2 + ")";
                    is.push(ival); //pushing the value of the infix with operator

                    String pv2 = is.pop(); //peek pe  jo hoga usse value 2 me lenge taki operation sahise e ho
                    String pv1 = is.pop();
                    String pval = "(" + pv1 + ch + pv2 + ")";
                    ps.push(pval); //pushing the value of postfix of operator


                } else {
                    Vs.push(ch - '0'); //converting the ascii to integer
                    is.push(ch + " ");
                    ps.push(ch + " ");
                }
            }

            System.out.println("valueSum" + Vs.pop());
            System.out.println("infix" + is.pop());
            System.out.println("prefix" + ps.pop());

        }

        public static int operation ( int v1, int v2, char ch){
            if (ch == '+') {
                return v1 + v2;
            } else if (ch == '-') {
                return v1 - v2;
            } else if (ch == '*') {
                return v1 * v2;
            } else if (ch == '/') {
                return v1 / v2;
            }
            return 0;
        }
    }
