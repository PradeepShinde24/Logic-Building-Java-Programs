// find the Factorial  (Approach 2)   

import java.util.*;

class program329
{
    public static int Factorial(int iValue)            // why static?-- bez there is no object creation so we have to use static
    {
        int iMult = 1;
        
        for(int iCnt = 1; iCnt <= iValue; iCnt++)
        {
            iMult = iMult*iCnt;
        }
        return iMult;
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iNo = sobj.nextInt();

        int iRet = Factorial(iNo);

        System.out.println("Factorial is: " +iRet);
    }
}