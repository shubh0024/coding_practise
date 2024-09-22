package com.company;

class Cylinder{
    int height;
   int radius;
//below is the exmple of constructors ;
   public Cylinder(int h , int r ){
       this.height= h;
       this.radius = r;
   }

   //below is the example of getters and setter;
    public int getHeight() {
        return height;
    }

    public int setHeight(int height) {
        this.height = height;
        return height;
    }
    public int getRadius(){return radius;}
    public void setRadius(int radius){this.radius = radius;}


    public double surfaceArea(){
        return 2 * 3.14 *radius * radius + 2* 3.14 * radius *height;
    }

    public double volume(){
        return  3.14 * radius* radius * height;
    }

}




public class cwh_44_cylinder {
    public static void main(String[] args) {
        //problem 1
        Cylinder myCylinder = new Cylinder(12,9);
       // myCylinder.setHeight(12);,
        System.out.println(myCylinder.getHeight());
      //  myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
  //problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());


    }
}