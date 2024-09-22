package com.patterns;

public class Z_print {
    public static void main(String[] args) {
       int n=5;
        for(int i=0; i<n; i++){
            System.out.print(" *");
        }
        for(int j=n-1; j>1; j--) {
            int i = 0;
            if (i == 0 || j == n - 1)
                System.out.print(" *");
        }
            System.out.println(" ");
        

        for(int j=0; j<n; j++){
            System.out.print(" *");
        }

    }
}
