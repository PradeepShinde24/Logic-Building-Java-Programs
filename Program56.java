// Take input from user and print there is 8 or not (Flag Method)

import java.util.*;

class Program56
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iNo = sc.nextInt();

        Digit obj = new Digit();
        boolean bRet = obj.CheckDigit(iNo);

        if(bRet == true)
        { 
            System.out.println("8 is present in number");
        }
        else
        {
            System.out.println("8 is not present in number");
        }

    }
}

class Digit
{
    public boolean CheckDigit(int iNo)
    {
        int iDigit = 0;
        boolean bFlag = false;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 8)
            {
                bFlag = true;
                break;
            }
            iNo = iNo / 10;
        }
        return bFlag;
    }
}