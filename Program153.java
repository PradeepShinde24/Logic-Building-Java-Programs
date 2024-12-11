// Take input from user and check letter is Capital or not

import java.util.*;

class Program153
{
    public boolean CheckCapital(char cValue)
    {
        if((cValue >= 65) && (cValue <= 90))
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

        System.out.println("Enter Character: ");
        char ch = sc.next().charAt(0);

        Program153 obj = new Program153();
        boolean bRet = obj.CheckCapital(ch);

        if(bRet == true)
        {
            System.out.println("Character " + ch +" is Capital letter: ");
        }
        else
        {
            System.out.println("Character " + ch + " is not Capital letter: ");
        }
    }
}