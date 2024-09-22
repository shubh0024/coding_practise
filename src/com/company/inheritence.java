package com.company;

//inheritence is used to code reusibility in java
class Base{
    int x;
    public int getX(){return x;}
    public void setX(int x){
        System.out.println("I am in base and setting ");
        this.x = x;
    }


 public void printMe(){
        System.out.println("I am constructor");
    }
}


class Derived extends Base{
   public  int y;

   public int getY(){return y;}
   public void setY(int y){
       this.y = y;}

}
public class inheritence {
    public static void main(String []args){
//Creating an object of base class
       Base b = new Base();
       b.setX(4);
        System.out.println(b.getX());


        //creating a an object of derived class

        Derived d = new Derived();
        d.setY(9);
        System.out.println(d.getY());
    }
}
