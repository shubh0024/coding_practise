package com.company;

interface sampleInterfaces{
    void meth1();
    void meth2();

}

interface SampleInterface{
    void meth1();

    void meth2();

}
//you cant able to extends class in the interfaces you can only extends interface using the class

interface childSampleInterface extends SampleInterface{

    void meth3();
    void meth4();
}

class MySampleclass implements childSampleInterface{

    public void meth1(){
        System.out.println("meth3");
    }
    public void meth2(){
        System.out.println("meth3");
    }

    public void meth3(){
        System.out.println("meth3");
    }

    public void meth4(){
        System.out.println("meth3");
    }
}

public class inheritencese_interfaces {
    public static void main(String[] args) {
        MySampleclass ms =new MySampleclass();
        ms.meth1();
        ms.meth2();
        ms.meth3();
        ms.meth4();
    }
}
