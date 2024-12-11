// Accept array and one element from user and find the index of that number in last occurance

import java.util.*;

class Program92
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int iSize = sc.nextInt();

        ArrayX obj = new ArrayX(iSize);
        
        obj.Accept();
        int iRet = obj.LastOccurance();
        if(iRet == -1)
        {
            System.out.println("Enter element is not present in the array");
        }
        else
        {
            System.out.println("Index of the number in last occurance is: "+iRet); 
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

    public int LastOccurance()
    {
        int iCnt = 0;
        int iPos = -1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number which you want to search: ");
        int iNo = sc.nextInt();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iPos = iCnt;
            }
        }
        return iPos;
    }
}