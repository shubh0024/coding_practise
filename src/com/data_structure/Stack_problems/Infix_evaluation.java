package com.data_structure.Stack_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_evaluation {
     public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String exp=br.readLine();

        Stack<Integer> opnds=new Stack<>();
        Stack<Character> optr=new Stack<>();
        for(int i=0; i<exp.length(); i++){
            char ch =exp.charAt(i);
            //1st condition
            if(ch == '('){
                optr.push(ch);

             //2nd condtion for cecking the digits(
            }else if(Character.isDigit(ch)){
                opnds.push(ch -'0'); //to get the intger value

            //3rd condition for the cheking  close to open in stak to perform the operation
            }else if(ch==')'){
                while(optr.peek()!='('){
                    char oprtr=optr.pop();
                     int v1=opnds.pop();
                     int v2= opnds.pop();

                     int opv=operation(v1,v2,oprtr); //opration krayge uspe jo av mila hai
                     opnds.push(opv);
                }
                optr.pop(); //jiska kam ho gya hai usko bhaar nikal do
            }else if(ch== '+' || ch=='-' || ch=='*' || ch=='/'){
                while(optr.size()>=0 && optr.peek()!='(' && precedence(ch)<=precedence(optr.peek())){
                    char oprtr=optr.pop();
                    int v1=opnds.pop();
                    int v2=opnds.pop();

                    int opv=operation(v1,v2,oprtr);
                    opnds.push(opv);
                }
                optr.pop();
            }
            optr.push(ch);//last me apna oprator ko push karayge
        }
        while(optr.size()!=0){
            char oprtr=optr.pop();
            int v1=optr.pop();
            int v2=optr.pop();

            int opv =operation(v1,v2,oprtr);
            opnds.push(opv);
        }
         System.out.println(opnds.peek());
    }

    //precedance calculator
    static int precedence(char optr){
        if(optr=='+'){
          return 1;
        }else if(optr=='-'){
           return 1;
        }else if(optr=='*'){
          return 2;
        }else if(optr=='/'){
          return 2;
        }
        return 0;
    }
 //operation perform
     static int operation(int v1,int v2,char optr) {
         if (optr == '+') {
             return v1 + v2;
         } else if (optr == '-') {
             return v1 - v2;
         } else if (optr == '*') {
             return v1 * v2;
         } else if (optr == '/') {
             return v1 / v2;
         }
         return 0;

     }
}
