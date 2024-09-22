package com.company;


class one{
    public void name(){
        System.out.println("my name is java");

    }
    public void greet(){
        System.out.println("hello everyone greetings ");

    }
static class two extends one {
    public void two() {
       System.out.println("hello dusraaa jii");
    }
    public void name(){
        System.out.println("hello name is overriding");
    }
}
}

public class Dynamic_method_dispathc {
    public static void main(String [] args){
       //super class ka object sub classs ke object ke brabar hai !
        one obj = new one.two();
        obj.greet();
        obj.name();

    }
}
