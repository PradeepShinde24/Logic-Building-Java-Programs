// Take Input from user and print the A  B  C  D  .....

// Input : 7
// Output : A  B  C  D  E  F  G

import java.util.*;

class Program104
{
    public void Display(int iFrequency)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1, ch = 'A'; iCnt <= iFrequency; iCnt++, ch++)
        {
            System.out.print(ch + "\t");
            // ch++;                                 // this line we can also in line number 15
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the frequency: ");

        int iFrequency = sc.nextInt();

        Program104 obj = new Program104();
        obj.Display(iFrequency);
    }
}