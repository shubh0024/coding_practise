package com.company;

class thre1 extends Thread{
    public thre1(String name){
        super(name);
    }
public void run(){
        int i=34;
        while(true){
            System.out.println("Thank you"+ this.getName());
        }

}
}

public class cwh_74_thread_priorities {
    public static void main(String[] args) {
        //Ready queue :1,t2.t3,t4,t5
  thre1 t1 = new thre1("harry1");
  thre1 t2 = new thre1("harry2");
  thre1 t3 = new thre1("harry3");
  thre1 t4 = new thre1("harry4");
  thre1 t5 = new thre1("harry5");
  thre1 t6 = new thre1("harry6");
  t1.setPriority(Thread.MAX_PRIORITY);
  t4.setPriority(Thread.MIN_PRIORITY);
  t3.setPriority(Thread.MIN_PRIORITY);
  t5.setPriority(Thread.MAX_PRIORITY);
  t6.setPriority(Thread.MAX_PRIORITY);
  t2.start();
  t2.start();
  t3.start();
  t4.start();
  t5.start();
  t6.start();


    }
}
