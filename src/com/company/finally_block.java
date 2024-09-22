package com.company;

public class finally_block {
    public static int greet() {
        try {
            int a = 50;
            int b = 2;
            int c=a/b;
            return c;

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            //its will run when execption doesnt occurs
            //it will execute at any cost
            System.out.println("cleaning this is end of the program");
        }
        return -2;
    }

    public static void main(String[] args) {

            int k =  greet();
        System.out.println(k);

        int a=7;
        int b= 9;
        while(true){
            try{
                System.out.println(a/b);
            }catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
               // it will execute at any cost
                System.out.println("i am finally for value of b =" +b);
            }
            b--;
        }
        try{
            System.out.println(50/3);

        }finally{
            System.out.println("yes this is finally");
        }
    }
}
