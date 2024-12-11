// Take Input from user and print the A  B  C  D  .....
// Input : 7
// Output : A  B  C  D  E  F  G

import java.util.*;

class Program103
{
    public static void Display(int iFrequency)
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

        Display(iFrequency);
    }
}