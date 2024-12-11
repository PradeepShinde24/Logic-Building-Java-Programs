// Take Input from user and print Number Forward (By For Loop)

import java.util.*;

class Program37
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
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

        System.out.println("Forward numbers:");
        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}