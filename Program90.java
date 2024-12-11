// Accept Array and one element from user and find the index of that number in first occurance.

import java.util.*;

class Program90
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int iSize = sc.nextInt();

        ArrayX obj = new ArrayX(iSize);
        
        obj.Accept();

        int iRet = obj.FirstOccurance();

        if(iRet == -1)
        {
            System.out.println("Ther is no such element: "); 
        }
        else
        {
            System.out.println("Index of the number in first occurance is: "+iRet); 
        }
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

        System.out.println("Enter the Numbers: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }
    }

    public int FirstOccurance()
    {
        int iCnt = 0;
        
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the elements that you want to search : ");
        int iNo = sc.nextInt();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }
        }

        if(iCnt == Arr.length)
        {
            return -1;
        }
        else
        {
            return iCnt;
        }
    }
}