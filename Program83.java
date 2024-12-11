// Accept N number from user and find the Largest number from the array

import java.util.*;

class Program83
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int iSize = sc.nextInt();

        ArrayX obj = new ArrayX(iSize);
        obj.Accept();

        int iRet = obj.DisplayLargest();
        System.out.println("Largest Number: " + iRet);
    }
}

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }
    }

    public int DisplayLargest()
    {
        int iMax = Arr[0];

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt]>iMax)
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }
}