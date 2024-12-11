// Pattern Printing--> I: 5, O: *  *  *  *  * (by using staic Keyword)

// Input : 7
// Output : *  *  *  *  *  *  *

import java.util.*;

class Program95
{
    public static void Display(int iFrequency)
    {
        for(int iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.print("*\t");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the frequency: ");
        int iFrequency = sc.nextInt();

        Display(iFrequency);
    }
}