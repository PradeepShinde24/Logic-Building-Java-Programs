// Take input from user and check input is Digit or not

import java.util.*;

class Program156
{
    public boolean CheckDigit(char cValue)
    {
        if((cValue >= '0') && (cValue <= '9'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);

        Program156 obj = new Program156();

        boolean bRet = obj.CheckDigit(ch);

        if(bRet == true)
        {
            System.out.println(ch + " is Digit");
        }
        else
        {
            System.out.println(ch + " is not Digit");
        }
     
    }
}