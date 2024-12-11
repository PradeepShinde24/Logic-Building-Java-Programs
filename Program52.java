// Take input from user and Display the Digits (For loop)

import java.util.*;

class Program52
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sc.nextInt();

        Digit obj = new Digit();
        obj.DisplayDigit(iNo);
    }
}

class Digit
{
    public void DisplayDigit(int iNo)
    {
        int iDigit = 0;

        for( ; iNo != 0; )
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}