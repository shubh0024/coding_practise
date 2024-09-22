package com.data_structure.dinesh_bariyani_lec;

public class isPalindrome {
    public Boolean ispalindrome(String word){
        char [] array= word.toCharArray();
        int start =0;
        int end = word.length() -1;

        while(start<end){
            if(array[start]!=array[end]){
                return false ;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome strng = new isPalindrome();
        if(strng.ispalindrome("asdfghjklkjhgfda")){
            System.out.println("the String is palindrome");
        }else{
            System.out.println("No Not a palindrome re!");
        }
    }
}
