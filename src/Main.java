class  Employee{
    int salary;
    String name;
    public int getSalary(){
    return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

class Cellphone {
    public void ringing() {
        System.out.println("Ringing ...");
    }public void vibrating(){
        System.out.println("vibrating....");
    }
    public void callfiend(){
        System.out.println("calling .......sashi");
    }
}
class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}

public class Main {
    public static void main(String[] args) {
        //problem1 39
       /* Employee shubham = new Employee();
        shubham.setName("code with shubham ");

        shubham.salary=234;
        System.out.println(shubham.getName());

        System.out.println(shubham.getSalary());

////problem 2:- cellphone
        Cellphone redmi = new Cellphone();
        redmi.ringing();
        redmi.vibrating();
        redmi.callfiend();
        */

     //problem 3
        Square sq = new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }

}