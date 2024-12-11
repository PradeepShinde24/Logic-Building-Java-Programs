// Take number from user and return the multiplication of even factors     (Optimaztion)    

import java.util.*;

class program333
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();
        int iRet = nobj.EvenFact(iNo);

        System.out.println("Multiplication of even factors is: " + iRet);
    }
}

class Numbers
{
    public int EvenFact(int iValue)
    {
        int iMult = 1;
        for(int iCnt = 2; iCnt <= iValue; iCnt = iCnt + 2)              // Time Complexity is N/2
        { 
            if((iValue % iCnt) == 0)                               
            {                
                    iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
}