// Take input from user and check letter is Small case or not

import java.util.*;

class Program155
{
    public boolean CheckCapital(char cValue)
    {
        if((cValue >= 'a') && (cValue <= 'z'))
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

        Program155 obj = new Program155();
        boolean bRet = obj.CheckCapital(ch);

        if(bRet == true)
        {
            System.out.println("Character " + ch +" is Small letter: ");
        }
        else
        {
            System.out.println("Character " + ch + " is not Small letter: ");
        }
    }
}