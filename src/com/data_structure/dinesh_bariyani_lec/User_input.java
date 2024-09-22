package com.data_structure.dinesh_bariyani_lec;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());//agar string or integer dono input karwana ho tab parse ka use karte hai
        String name =sc.nextLine();
        
        System.out.println("dear" + name + " here is counting ");
        for (int i=0 ; i<n; i++){
            System.out.println(" the number is itna "+i);
        }



    }
}
