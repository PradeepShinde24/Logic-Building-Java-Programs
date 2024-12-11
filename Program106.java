// Take Input from user and print the 2  4  6  8 ....

// Input : 7
// Output : 2  4  6  8  10  12  14 

import java.util.*;

class Program106
{
    public void Display(int iFrequency)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.print(2*iCnt + "\t");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Frequency: ");
        int iFrequency = sc.nextInt();

        Program106 obj = new Program106();
        obj.Display(iFrequency);
    }
}