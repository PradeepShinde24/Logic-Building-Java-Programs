// Write a program which accepts the marks and display the class accordingly
//  0 to 34         Fail
//  35 to 49        Pass Class
//  50 to 59        Second Class
//  60 to 74        First Class
// 75 to 100        First Class with Distinction

import java.util.*;

class Program8
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks");
        float fMarks = sc.nextFloat();

        Number obj = new Number();

        obj.DisplayClass(fMarks);
    }
}

class Number
{
    public void DisplayClass(float fMarks)
    {
        if((fMarks < 0.0f) || (fMarks > 100.00f))        // Filter  
        {
            System.out.println("Invalid Input");
            System.out.println("Please enter the marks in between the range 0 to 100");
            return;
        }

        if((fMarks >= 0.0f) && (fMarks < 35.00f))
        {
            System.out.println("You are fail!");
        }
        else if((fMarks >= 35.00f) && (fMarks < 50.00f))
        {
            System.out.println("You got pass class!");
        }
        else if((fMarks >= 50.00f) && (fMarks < 60.00f))
        {
            System.out.println("You got second class!");  
        }
        else if((fMarks >= 60.00f) && (fMarks < 75.00f))
        {
            System.out.println("You got first class!");
        }
        else if((fMarks >= 75.00f) && (fMarks <= 100.00f))
        {
            System.out.println("You got first class with distinction!");
        }         
    }
 
}