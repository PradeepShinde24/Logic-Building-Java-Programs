// Take input from user and check letter is Capital or not

import java.util.*;

class Program154
{
    public boolean CheckCapital(char cValue)
    {
        if((cValue >= 'A') && (cValue <= 'Z'))
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

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        Program154 obj = new Program154();
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