// Take Inputes from user and display that elements of array   (Approach 1)  here we used the length property 

import java.util.*;

class Program73
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int iSize = sc.nextInt();

        if(iSize < 0)               // Updater
        {
            iSize = -iSize;
        }

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements: ");

        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }

        System.out.println("Elements of array are: ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt] + "\t");
        }
    }
}