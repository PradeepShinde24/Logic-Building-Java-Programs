// Display "Jay Ganesh" n times on screen (Static Keyword)

import java.util.*;

class Program12
{
    public static void Display(int iNo)            // static---no need to create object   
    {
        int iCnt = 0;
        
        if(iNo<0)                   // Filter
        {
            System.out.println("Please Enter the Positive Number:");
            return;
        }
        
        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...\n");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequecy of Jay Gnaesh:");
        int iValue = sobj.nextInt();

        Display(iValue);
    }
}