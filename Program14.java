// Display "Jay Ganesh" n times on screen

import java.util.*;

class Program14
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequecy of Jay Gnaesh:");
        int iValue = sobj.nextInt();

        NameGanesh nobj = new NameGanesh();
        nobj.Display(iValue);
    }
}

class NameGanesh
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        
        if(iNo<0)                   // Updater
        {
            iNo = -iNo;            
        }
        
        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...\n");
        }
    }
}