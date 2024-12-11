// Take Input from user and return the average of the elements of the array

import java.util.*;

class Program81
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int iSize = sc.nextInt();

        ArrayX obj = new ArrayX(iSize);
        obj.Accept();

        float fRet = obj.Average();
        System.out.println("Average odf the elements of the array are : " + fRet);
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

    public float Average()
    {
        float iSum = 0.0f;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return (iSum / Arr.length);
    }
}