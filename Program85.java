// Accept N number from user and find the Largest and Smallest number from the array (Time Complexity is 2N)

import java.util.*;

class Program85
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the siaze of Array:");
        int iSize = sc.nextInt();
        
        ArrayX obj = new ArrayX(iSize);
        obj.Accept();

        int sRet = obj.DisplaySmallest();
        System.out.println("Smallest Number:" + sRet);

        int lRet = obj.DisplayLargest();
        System.out.println("Largest Number:" + lRet);
    }
}

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int [iSize];
    }

    public void Accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements:");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++) 
        {
            Arr[iCnt] = sc.nextInt();
        }
    }

    public int DisplaySmallest()
    {
        int iMin = Arr[0];

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }
        return iMin;
    }

    public int DisplayLargest()                  
    {
        int iMax = Arr[0];

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }
}