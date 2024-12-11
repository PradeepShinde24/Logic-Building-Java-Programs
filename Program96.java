// Pattern Printing--> I: 5, O: A  A  A  A  A

// Input : 7
// Output : A  A  A  A  A  A  A

import java.util.*;

class Program96
{
    public static void Display(int iFrequency)
    {
        for(int iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.print("A\t");
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