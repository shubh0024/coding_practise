package com.company;

class A{
    public int a;
    public int harry () {
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");

    }
static class B extends A{
        public void meth3(){
            System.out.println(" i am the method  3 of class B");

        }
        public void meth2(){
            //overriding condition for the B because its special declaration of its own methods .
            System.out.println("i am method 2 of class B");

        }
}
}
public class method_overriding {
    public static void main(String [] args){
        A a =new A();
        a.meth2();

        A.B b = new A.B();
        b.meth2();

    }
}
