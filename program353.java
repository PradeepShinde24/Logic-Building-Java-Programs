// Take a string from user and Display & Count the small characters.---->Using toCharArray() method 

import java.util.*;

class program353
{
    public static void main(String Arg [])
    {
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        int iRet = obj.CountSmall(name);
        System.out.println("Number of small character are: " +iRet);
    }
}

class StringX
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
                System.out.println(Arr[iCnt]);
            }
        }
        return iCount;
    }
}