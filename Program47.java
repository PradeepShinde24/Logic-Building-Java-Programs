// Take input from user and display the digit

import java.util.*;

class Program47
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numner: ");
        int iNo = sc.nextInt();

        Digit obj = new Digit();
        obj.DisplayDigits(iNo);
    }
}

class Digit
{
    public void DisplayDigits(int iNo)
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