package com.company;
import java.util.Scanner;
public class flag_looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        marks[0] = 5;
        marks[1] = 56;
        marks[2] = 6;


        Boolean flag = true;
        while (flag) {
            System.out.println("Enter the number you want");
            int ind = sc.nextInt();
            try {
                System.out.println("welcome to my try block system");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("this is not exist at any index");
                    System.out.println("this is at second level");
                }
                } catch (Exception e) {
                    System.out.println("thsi is 1st level");
                }
            }
                System.out.println("thanks for the running the program");
            }
        }

