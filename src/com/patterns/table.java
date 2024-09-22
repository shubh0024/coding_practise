package com.patterns;

import java.awt.*;
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int x = 1;
        for (int i = 1; i <=10; i++) {
            int value = x * i;
            System.out.println(x +"*"+i + " " + value);
        }
    }
}
