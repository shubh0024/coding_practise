package com.company;
import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        return  "i m to string";
    }

    public String getMessage() {
        return  "i am get Messsage";
    }
}
public class throw_execpetion{
        public static void main(String[] args) {
            int a;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if (a < 99) {
                try {
                   // throw new MyException();
                    throw new ArithmeticException("This is an execption");
                    //throw object is created for this
                } catch (Exception e) {


                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                    e.printStackTrace();//whenenr u have done somthing in program
                    //wants to find out
                    System.out.println("Finished");
//                   // it will print the get message

                }
                System.out.println("yes Finished ");



            }
        }
    }
