package com.company;
import java.util.Scanner;
public class exception_all {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[1] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide");
        int number = sc.nextInt();
        try {
            System.out.println("the value of array index entered is:" + marks[ind]);
             System.out.println("the value of array-value is " + marks[ind] / number);
        }catch(ArithmeticException e){
            System.out.println("Arithemtic exception");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("aarayINdexoutofBOUndExcepition occured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("sum other exception occured :!");
            System.out.println(e);

        }
    }
}
