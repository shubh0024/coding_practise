package com.company;

class Negativeexception extends Exception{
    public String toString(){
        return "Radius csnnot be negative";
        }
        public String getMessage(){
        return "I am getMessage  radius not ng";
        }
        }

public class cwh84_throw_throws {
    public static double area(int r) throws Negativeexception {
        if(r<0){
                throw new Negativeexception();
    }
        double result= Math.PI * r *r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result=a /b;
        return result;
    }
    public static void main(String[] args) {
        try{
//            int c= divide(6,0);
//            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        }catch(Exception e){
            System.out.println("Exception");
        }


    }
}
