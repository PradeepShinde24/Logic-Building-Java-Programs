// Take string from input and count the digits.

import java.util.*;

class Program164
{
    public int CountDigits(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= '0') && (Arr[iCnt]) <= '9')
            {
                iCount++;
            }
        }
        return iCount;
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        Program164 obj = new Program164();
        int iRet = obj.CountDigits(str);

        System.out.println("Number of the Digigts are: "+iRet);
    }
}