// Take Input from user and print the positive number in reverse order\

// Input : 7
// Output : 7  6  5  4  3  2  1

import java.util.*;

class Program100
{
    public void Display(int iFrequency)
    {
        for(int iCnt = iFrequency; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt + "\t");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the frquency: ");
        int iFrequency = sc.nextInt();

        Program100 obj = new Program100();

        obj.Display(iFrequency);
    }
}