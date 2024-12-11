// Take Input from user and print Number Backward (By For Loop)

import java.util.*;

class Program38
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int iNo = sc.nextInt();

        Number obj = new Number();
        obj.DisplayF(iNo);
    }
}

class Number
{
    public void DisplayF(int iValue)
    {
        int iCnt = 0;

        System.out.println("Backward numbers:");
        for(iCnt = iValue; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}