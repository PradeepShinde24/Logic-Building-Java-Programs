// Take Input from user and print the positive number from 0 to N-1

// Input : 7
// Output : 0  1  2  3  4  5  6  

import java.util.*;

class Program99
{
    public static void Display(int iFrequency)
    {
        for(int iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.print((iCnt -1) + "\t");
        }
    } 

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Frequency: ");
        int iFrequency = sc.nextInt();

        Display(iFrequency);
    }
}