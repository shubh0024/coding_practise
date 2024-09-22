package com.company;
import java.util.ConcurrentModificationException;

class MYexception extends Exception{
    public String toString(){
        return "i am toString()";
    }

    public String getMessage(){
        return  "i am get Message";
    }
}
class Calculator {
//    double add(double a,double b) throws InvalidInputException,CannotDivideByZeroExcetion{

//        if (a == 8 || b == 9) {
//
//        System.out.println(a,b);
//        }
//        return a + b;
//    }
     double subtract(double a,double b){
        return a-b;

    }  double Multiply(double a,double b){
        return a*b;

    }  double divide(double a,double b){
        return a/b;

    }
}
//public class New_Calculator {
//    public static void main(String[] args) throws InvalidInputException{
// Calculator c = new Calculator();
// c.add(8,9);
//    }
//}
