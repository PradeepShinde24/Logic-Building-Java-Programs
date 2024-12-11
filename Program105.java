// Take Input from user and print the a  1  b  2  c  3  ...

// Input : 7
// Output : a   1   b   2   c   3   d   4   e   5   f   6   g   7

import java.util.*;

class Program105
{
    public void Display(int iFrequency)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1, ch = 'a'; iCnt <= iFrequency; iCnt++, ch++)
        {
            System.out.print(ch + "\t" + iCnt + "\t");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Frequency: ");
        int iFrequency = sc.nextInt();

        Program105 obj = new Program105();
        obj.Display(iFrequency);
    }
}