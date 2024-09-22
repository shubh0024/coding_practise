package com.data_structure.Stack_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class infix_topst_pre{
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String exp= br.readLine();

        Stack<String> pre=new Stack<>();
        Stack<Character> optr=new Stack<>();
        Stack<String> post=new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char ch =exp.charAt(i); //storing the variable of exp with using the pointer

            if(ch=='('){
                optr.push(ch);

            }else if((ch>='0' && ch<='9') || (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                    post.push(ch+"");
                    pre.push(ch+"");
            }else if(ch==')'){
                while(optr.peek()!='('){
                   char op=optr.pop();


                   //perfroming the action of the prefix
                   String postv2 = post.pop();
                   String postv1 = post.pop();

                   String postv=postv1 + postv2 + op;
                   post.push(postv);



                   //storing and performing the action of the postfix
                   String prev2= pre.pop();
                   String prev1= pre.pop();

                    String prev=op+ prev1 + prev2 ;
                   post.push(prev);
                }
                optr.pop(); //pop  the opnening parathensis
            } else if (ch=='+' || ch=='-' || ch=='*' || ch=='/') {
             while(!optr.isEmpty()  && optr.peek()!='(' && precedence(ch)<=precedence(optr.peek())){

                 char op=optr.pop();
                 //perfroming the action of the prefix
                 String postv2 = post.pop();
                 String postv1 = post.pop();

                 String postv=postv1 + postv2 + op;
                 post.push(postv);

                 //storing and performing the action of the postfix
                 String prev2= pre.pop();
                 String prev1= pre.pop();

                 String prev=op+ prev1 + prev2 ;
                 pre.push(prev);

             }
             optr.push(ch);
            }
        }
        while(!optr.isEmpty()){
            char op=optr.pop();
            //perfroming the action of the prefix
            String postv2 = post.pop();
            String postv1 = post.pop();

            String postv=postv1 + postv2 + op;
            post.push(postv);

            //storing and performing the action of the postfix
            String prev2= pre.pop();
            String prev1= pre.pop();

            String prev=op+ prev1 + prev2 ;
            pre.push(prev);

        }
        System.out.println("postfix"+post.pop());
        System.out.println("prefix"+pre.pop());
    }

    public static int precedence(char op){
        if(op=='+' || op=='-'){
            return 1;
        }else if(op=='*' || op=='/'){
            return 2;
        }
        return 0;
    }
}
