// Accept N number from user and find the Largest and Smallest number from the array (Time Complexity is N)

import java.util.*;

class Program86
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of array: ");
        int iSize = sc.nextInt();

        ArrayX obj = new ArrayX(iSize);

        obj.Accept();
        obj.DisplayLargestSmallest();
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

    public void DisplayLargestSmallest()
    {
        int iMax = Arr[0];
        int iMin = Arr[0];

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }

            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }
        System.out.println("Largest number is:" +iMax);
        System.out.println("Smallest number is:" +iMin);
    }
}