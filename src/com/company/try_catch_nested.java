package com.company;
import java.util.Scanner;
public class try_catch_nested {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[4];

        marks[0] = 4;
        marks[1] = 56;
        marks[2] = 6;

        int ind = sc.nextInt();
        try {
            System.out.println("welcome to try cstch system");
            try {
                System.out.println(marks[ind]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("sorry this arrray not exits");

            }
        }catch(Exception e){
            System.out.println("execption is level 1");
        }
    }

}
