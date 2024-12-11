// Accept two numbers from user and checkwhether the input number is present or not in array.(Without Flag)

import java.util.*;

class Program88
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int iSize = sc.nextInt();

        ArrayX obj = new ArrayX(iSize);
        
        obj.Accept();
        boolean bRet = obj.Search();
        
        if(bRet == true)
        {
            System.out.println("Number is present in the arry.");
        }
        else
        {
            System.out.println("Number is not present in the arry.");
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

        System.out.println("Enter the number: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }
    }

    public boolean Search()
    {
        int iCnt = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements that you want to search:");
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
            return false;
        }
        else
        {
            return true;
        }
    } 
}