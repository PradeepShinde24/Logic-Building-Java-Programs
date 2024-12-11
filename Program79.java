// Take Input from user and Count the Even number from the array

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
        int iRet = obj.EvenCount();

        System.out.println("Count of the Even Number in array are: "+iRet);

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

    public void Display()
    {
        System.out.println("Elements of the are are: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int EvenCount()
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iCount++;
                System.out.println("Even Number: "+Arr[iCnt] + "\t");
            }
        }
        return iCount++;
    }
}