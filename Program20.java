// Display the numbers 1 to X

import java.util.*;

class Program20
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the frequency for number print:");
        int iNo = sc.nextInt();

        Number obj = new Number();

        obj.Display(iNo);
    }
}

class Number
{
    public void Display(int iValue)              
    {
        if(iValue < 0)                       // Updater
        {
            iValue = -iValue;
        }

        int iCnt = 0;

        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}