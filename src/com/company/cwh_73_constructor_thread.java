package com.company;


import com.sun.source.util.SourcePositions;

class Mythread extends Thread{
     public Mythread(String name){
         super(name);

     }
     public void run(){
         int i=34;
         System.out.println("Thank you");
//         while(true){
//             System.out.println("i ama  thread");
//
//         }
     }
}
class Mythread2 extends Thread{
    public Mythread2(String name){
        super(name);

    }
    public void run(){
        int i=34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("i ama  thread");
//
//        }
    }
}
public class cwh_73_constructor_thread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread("shubham");
        Mythread2 t2= new Mythread2("sashi");

        t1.start();
        t2.start();
        System.out.println("the id of the thread t is "+t1.getId());
        System.out.println("the name of the thread is "+t2.getStackTrace());

    }
}
