// Take two number form user and display the element of array (Approach 1)

import java.util.*;
 
class program343
{
    
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Elements: ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];
        
        System.out.println("Enter the elements: ");
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of array are: ");    
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}