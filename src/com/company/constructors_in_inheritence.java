package com.company;

class Base1{
    Base1(){
        System.out.println(" i am the base constructor");
    }
    Base1(int a){
        System.out.println("i am an overload base constructor with value of class a as :" +a);
    }
    public int x;

    public int  getX(){return x;}
    public void setX(int x){this.x = x;}

static class Derived2 extends Base1{
        Derived2(){
            //for runninf the arguments of constructor write in declaration in child class .
           // super(98765);
            System.out.println("i am derived class constructor");
        }
    Derived2(int x,int y){
        //for runninf the arguments of constructor write in declaration in child class .
         super(x);
        System.out.println("i am the overloaded  derived constructor: "  +y);
    }
       public int y;

        public int getY(){return y;}
        public void setY(int y){this.y= y;}
    }
    static class childofDerived extends Derived2{
        childofDerived(){
            System.out.println("i am the childofDerived constructor");
        }
        childofDerived(int x,int y,int z){
             super(x,y);
            System.out.println("i am overloaded constructor childofDerived value of z: " +z);
        }
    }
}



public class constructors_in_inheritence {
    public static void main(String [] args) {
//        Base1 b = new Base1();
//        b.setX(4);
//        System.out.println(b.getX());
      //  Base1.Derived2 d = new  Base1.Derived2(9,8);
        Base1.childofDerived cd= new Base1.childofDerived(1,2,4);
    }
}
