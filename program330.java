// find the Factorial  (Approach 3)   

import java.util.*;

class program330
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.Factorial(iNo);

        System.out.println("Factorial is: " +iRet);
    }
}

class Numbers
{
    public int Factorial(int iValue)              // why not static?-- bez in this approach we create object
    {
        int iMult = 1;
        
        for(int iCnt = 1; iCnt <= iValue; iCnt++)
        {
            iMult = iMult*iCnt;
        }
        return iMult;
    }
}