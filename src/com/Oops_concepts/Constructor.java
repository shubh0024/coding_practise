package com.Oops_concepts;

public class Constructor {
    public static class person {
        int age;
        String name;

        void sayhi() {//function
            System.out.println(name + "[ " + age + " ]");
        }
        //if we forget ,java provides our class a default constructor
        person(){//if deefault constructor and paramterizzed also alocated  then mention here to get
            int age=10;
            int name ='A';
        }
        person(int age ,String name){
            //this will automatically passed through the constructor
            this.age=age;
            this.name=name;
        }
    }
        public static void main(String[] args) {
           person p1 = new person();
            p1.age = 10;
            p1.name="S";
            p1.sayhi();

            person p2=new person(20,"fsdfd");
            p2.sayhi();
        }

    }

