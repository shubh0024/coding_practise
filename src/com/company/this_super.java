package com.company;

class ekclass{
    int x;
    public int getX(){return x;}
  //  public void setX(int x){this.x = x;}
    ekclass(int x){
        this.x=x;
    }

    public int returnnone(){
        return 1;
    }

 static class Doclass extends ekclass{
        Doclass(int c){
super(c);
System.out.println("mai ek constructor hoon");
        }
 }
}
public class this_super {
    public static void main(String[] args) {
        ekclass e = new ekclass(65);
        ekclass.Doclass d = new ekclass.Doclass(5);
        System.out.println(e.getX());
    }
}