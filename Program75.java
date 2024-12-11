// Take Inputes from user and display that elements of array   (Approach 2)

import java.util.*;

class Program75
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int iSize = sc.nextInt();

        if(iSize < 0)                    // Filter
        {
            System.out.println("Please enter the positive number:");
        }

        ArrayX obj = new ArrayX(iSize);
        obj.Accept();
        obj.Display();
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
        Scanner sc = new  Scanner(System.in);
        
        System.out.println("Enter the elements: ");

        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of the are: ");

        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt] + "\t");
        }
    }
}