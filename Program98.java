// Take Input from user and print the positive number

// Input : 7
// Output : 0  1  2  3  4  5  6  

import java.util.*;

class Program98
{
    public static void Display(int iFrequency)
    {
        for(int iCnt = 0; iCnt < iFrequency; iCnt++)
        {
            System.out.print(iCnt + "\t");
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