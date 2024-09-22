package com.company;


class MyThreadRunnable1 implements  Runnable{
    public void run(){
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
        System.out.println("i am a thread 12 not a threat");
    }
}
class MyThreadRunnable2 implements  Runnable{
    public void run(){
        System.out.println("i am a thread 2 not a threat");
        System.out.println("i am a thread 2 not a threat");
        System.out.println("i am a thread 2 not a threat");
        System.out.println("i am a thread 2 not a threat");
        System.out.println("i am a thread 2 not a threat");
        System.out.println("i am a thread 2 not a threat");
        System.out.println("i am a thread 2 not a threat");
        System.out.println("i am a thread 2 not a threat");
    }
}class MyThreadRunnable3 implements  Runnable{
    public void run(){
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
        System.out.println("i am a thread3 not a threat");
    }
}


public class CH_runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread g1 = new Thread(t1);
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread g2 = new Thread(t2);
        MyThreadRunnable3 t3= new MyThreadRunnable3();
        Thread g3 = new Thread(t3);
        g1.start();
        g2.start();
        g3.start();
    }
}
