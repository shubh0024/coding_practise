package com.company;

public class lamda_109 {
    interface  DemoAno{
        void meth1();
        void meth2();
    }
    class AnnonyDemo implements DemoAno{
        public void display(){
            System.out.println("hello");
        }

        @Override
        public void meth1() {

        }

        @Override
        public void meth2() {

        }
    }
    public static void main(String[] args) {
        DemoAno obj =new DemoAno(){
            public void meth1(){
                System.out.println("i am meth1");
            }
            public void meth2(){
                System.out.println("i am meth2");
            }
        };
        obj.meth1();
        obj.meth2();
        obj.meth1();
        obj.meth2();

    }
}
