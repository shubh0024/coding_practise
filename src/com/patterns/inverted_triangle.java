package com.patterns;

import java.util.Scanner;
//
//1_____1
//_2___2_
//__3_3__
//___4___
//__3_3__
//_2___2_
//1_____1
public class inverted_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = n;
        int sp = 0;
        int val=1;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=sp; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <= st; k++) {
                if(k>1 && k<st) {
                    System.out.print("\t");
                }else
                    System.out.print(val + "\t");

            }

            if (i <= n / 2) {
                sp++;
                st -= 2;
                val++;
            } else {
                sp--;
                st += 2;
                val--;
            }
            System.out.println();

        }
    }
}

