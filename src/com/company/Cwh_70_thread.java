package com.company;


class MyThreads1 extends Thread {
    public void run() {
        int i=0;
        if (i<5) {

            System.out.println("i am running");
            System.out.println("i am stopping");

        }
    }
}
    class MyThreads2 extends Thread {
        public void run() {
            int i=0;
            if (i<10) {
                System.out.println("thread2  is running");
            }
            else{
                System.out.println("hello i am second printing ");
            }
        }
    }


    public class Cwh_70_thread {
        public static void main(String[] args) {
            MyThreads1 t1 = new MyThreads1();
            MyThreads2 t2 = new MyThreads2();

            t1.start();
            t2.start();


        }
    }

