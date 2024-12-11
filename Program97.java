// Take Input from user and print the positive number

// Input : 7
// Output : 1  2  3  4  5  6  7

import java.util.*;

class Program97
{
    public void Display(int iFrequency)
    {
        for(int iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.print(iCnt + "\t");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the frequency of the symbol: ");
        int iFrequency = sc.nextInt();

        Program97 obj = new Program97();
        obj.Display(iFrequency);

    }
}