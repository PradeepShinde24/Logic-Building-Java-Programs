// Take Input from user and Display the Even number from the array

import java.util.*;

class Program77
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int iSize = sc.nextInt();

        if(iSize < 0)
        {
            System.out.print("Pease enter the positive numbers:");
        }

        ArrayX obj = new ArrayX(iSize);
        obj.Accept();
        obj.Display();
        obj.EvenDisplay();

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
        System.out.println("Elements of the arrray are: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public void EvenDisplay()
    {
        System.out.println("Even Numbers: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                System.out.print(Arr[iCnt] + "\t");
            }
        }
    }
}