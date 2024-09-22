package com.company;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
/*       creating the calculator which the following operations ;

        1.adiition
        2.subtraction
        3.multiplicATON
        4.division
       which throws the following exception s
       1.invalid input Exception ex:8,9
       2.cannot divide by 0 exception
       3.max input Exception if the any input is greater than 10000
       4.Max Mhultiplier reached Exception -don't allow muulitiplication input to graeter than 7000

do // do while is for many operations
{
    try
    {
        System.out.println("Enter num1 and num2 : ");
        int num1 = new Scanner();
        int num2 = new Scanner();
        System.out.println("Enter sign : ");
        char sign = new Scanner();
    }
    catch(IllegalArgumentException ex) // This will check for illegal inputs
    {
        System.out.println(ex.Message()); //Will print error message
    }

    if(sign == '+')
    { // part of code where you will write the plus operation
        System.out.println(num1+num2);
    }
    if(sign == '-')
    {
        System.out.println(num1-num2);
    }
    if(sign == '*')
    {
        System.out.println(num1*num2);
    }
    if(sign == '/')
    {
        try
        {
            System.out.println(num1/num2);
        }
        catch(ArithmeticException ex)// Check for divide by zero exception
        {
            System.out.println("Divide by zero");
        }
    }

    if(sign == 'x') // to exit
    {
        flag = false
    }

    else
    {
        System.out.println("Error : Unknown Operator\n");
    }
*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter the operator ");

        char op=sc.next().charAt(0);
        int result=0;

        switch(op) {
            //case to add numbers
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;

            default:
                System.out.println("u entering the wrong input");
        }

                System.out.println("the final result");
                System.out.println();

                //print the reuslt
                System.out.println(num1 + " " + op + " " + num2 + " = "+ result);



    }

}
