// Display "Jay Ganesh" n times on screen

import java.util.*;

class Program13
{
    public void Display(int iNo)             // Not static keyword is use = Cretae object
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

        Program13 pobj = new Program13();

        pobj.Display(iValue);
    }
}