// Take Input from user and print the a  b  c  d  .....

// Input : 7
// Output : a  b  c  d  e  f  g

import java.util.*;

class Program102
{
    public void Display(int iFrequency)
    {
        int iCnt = 0;
        char ch = 'a';

        for(iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.print(ch + "\t");
            ch++;
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the frequency: ");

        int iFrequency = sc.nextInt();

        Program102 obj = new Program102();
        obj.Display(iFrequency);
    }
}