package com.data_structure.Stack_problems;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class prefix_to_infixpostfix {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String exp = br.readLine();

        Stack<Integer> Vs = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<String> Is = new Stack<>();

        for (int i = exp.length() - 1; i > 0; i--) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v1 = Vs.pop();
                int v2 = Vs.pop();
                int val = operation(v1, v2, ch);
                Vs.push(val);

                String pv1 = post.pop();
                String pv2 = post.pop();
                String pval = "(" + pv1 + pv2 + ch + ")";
                post.push(pval);

                String iv1 = Is.pop();
                String iv2 = Is.pop();
                String Ival = "(" + iv1 + ch + iv2 + ")";
                Is.push(Ival);

            } else {
                Vs.push(ch - '0');
                post.push(ch + "");
                Is.push(ch + "");

            }
        }
    }

    public static int operation(int v1, int v2, char ch) {
        if (ch == '+') {
            return v1 + v2;

        }
        if (ch == '-') {
            return v1 - v2;

        }
        if (ch == '*') {
            return v1 * v2;

        }
        if (ch == '/') {
            return v1 / v2;
        }

        return 0;
    }
}

