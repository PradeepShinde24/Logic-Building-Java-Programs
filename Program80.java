// Take Input from user and Count the Odd number from the array

import java.util.*;

class Program79
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int iSize = sc.nextInt();

        ArrayX obj = new ArrayX(iSize);

        obj.Accept();
        obj.Display();
        int iRet = obj.OddCount();

        System.out.println("Count of the Odd Number in array are: "+iRet);

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
s
        System.out.println("Enter the elements: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of the are are: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int OddCount()
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2) != 0)
            {
                iCount++;
            }
        }
        return iCount++;
    }
}