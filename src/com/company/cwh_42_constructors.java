package com.company;

class MyMainEmployee{
    int id ;
    String name;



public MyMainEmployee(String mylame,int myID){
    id = myID;
    name= mylame;
}
     public String getName() {return name;}
     public void setName(String n){this.name=n;}
     public void setId(int i){this.id= i;}
      public int getId(){return id;}


}

public class cwh_42_constructors {
    public static void main(String [] args){
        MyMainEmployee sk = new MyMainEmployee("helloooo",98);

        System.out.println(sk.getId());
       System.out.println(sk.getName());

    }

}
