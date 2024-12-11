// Take Input from user and print the numbers

// Input : 5
// Output : 1  2  3  4  5  5  4  3  2  1

import java.util.*;

class Program107
{
    public static void Display(int iFrequency)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.print(iCnt + "\t");
        }
        for(iCnt = iFrequency; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt + "\t");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Frequency: ");
        int iFrequency = sc.nextInt();

        Display(iFrequency);
    }
}