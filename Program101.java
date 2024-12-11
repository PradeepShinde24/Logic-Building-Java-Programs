// Take Input from user and print the positive number in reverse order and star in between

// Input : 7
// Output : 7  *  6  *  5  *  4  *  3  *  2  *  1  *

import java.util.*;

class Program101
{
    public void Display(int iFrequency)
    {
        for(int iCnt = iFrequency; iCnt > 0; iCnt--)
        {
            System.out.print(iCnt +"\t"+"*"+"\t");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Frequency: ");

        int iFrequency = sc.nextInt();

        Program101 obj = new Program101();
        obj.Display(iFrequency);
    }
}