// Take input from user and Display the Digits (while loop)

import java.util.*;

class Program51
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

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}