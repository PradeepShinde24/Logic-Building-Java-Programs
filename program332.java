// Take number from user and return the multiplication of even factors        //((iValue % ((iCnt % 2) == 0)) == 0)  just check for me after lectire for lane no 28

import java.util.*;

class program332
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
        for(int iCnt = 1; iCnt <= iValue; iCnt++)               // time complexity is N
        { 
            if(((iValue % iCnt) == 0) && ((iCnt % 2) == 0))           
            {                
                    iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
}