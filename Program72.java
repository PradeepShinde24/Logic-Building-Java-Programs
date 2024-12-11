// Take Inputes from user and display that elements of array   (Approach 1)

import java.util.*;
 
class Program72
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int iSize = sc.nextInt();

        if(iSize < 0)                   // Filter
        {
            System.out.println("Please enter the Positive number:");
        }

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements: ");
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }

        System.out.println("Elements of array are: ");
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}