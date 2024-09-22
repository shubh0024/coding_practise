package com.company;

interface Camera {
    void takesnap();

    void recordvideo();

    private void greet(){
    System.out.println("Good Moring");
    }

    default void record4Kvideo(){
        greet();
        System.out.println("Recording...... in 4k");
    }



}

interface wifi{
    String [] Network();
    void connecttoNetwork();

}
class cellphone{
    void callNUmber(int Number){
        System.out.println("calling to number" +Number);

    }

    void Pickcall(){
        System.out.println("connecting .....");
    }
}

class mysmartphone extends cellphone implements Camera ,wifi{
    public void takesnap(){
        System.out.println("taking ...snap");

    }
    public void recordvideo(){
        System.out.println("recording .......video");
    }

    public String[] Network(){
        System.out.println("getting the networks ...");
        String[] Networklist= {"shubham ", "sashi"};
        return Networklist;
    }


    public void connecttoNetwork() {
        System.out.println("coonecting to network.....");

    }
}
public class interfaces_smartphone {
    public static void main(String[] args) {
        System.out.println("heollo");
       mysmartphone phone = new mysmartphone();
       phone.connecttoNetwork();
       phone.recordvideo();
       phone.callNUmber(987656789);
       phone.takesnap();

      // phone.greet();  throws an error
        String[] ar =phone.Network();
        for(String item:ar){
            System.out.println(item);
        }
    }
}
