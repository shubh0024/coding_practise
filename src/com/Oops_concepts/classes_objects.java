package com.Oops_concepts;

public class classes_objects {
    public static class Person{
        int age;
        String name;

        void sayhi(){//function ki kahani
            System.out.println(name+"{"+age+"}"+"sayshi");
        }
    }

    public static void main(String[] args) {
    Person p1=new Person();
    p1.age=10;
    p1.name="shu";
    p1.sayhi();


    Person p2=new Person();
    p2.name="hello";
    p2.age=24;//josabse karib or last me chalega usio lenge
         p2.sayhi();

//    Person p3=p1; //instance variables for the p3
//    p3.age=30;

    //calling the function
        swap1(p1,p2);
        swap2(p1,p2);
//    p3.sayhi();
    p1.sayhi();//print the refrence  from pointed by p3 to p1
    }
    public static void swap1(Person psn1,Person psn2){
        Person temp=psn1;
        psn1=psn2;
        psn2=temp;
        //its occur no change

    }
    public static void swap2(Person p1,Person p2){
        int age=p1.age;
        p1.age=p2.age;
        p2.age=age;

        String name= p1.name;
        p1.name=p2.name;
        p2.name=name;


    }

}
