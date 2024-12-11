// Display the numbers 1 to X

import java.util.*;

// class Program18
// {
//     public static void main(String arg[])
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the frequency for number print:");
//         int iNo = sc.nextInt();

//         // Number obj = new Number();
//         Number.Display(iNo);
//     }
// }

// class Number
// {
//     public static void Display(int iValue)                 // Static keyword
//     {
//         int iCnt = 0;

//         for(iCnt = 1; iCnt <= iValue; iCnt++)
//         {
//             System.out.println(iCnt);
//         }
//     }
// }

class Program18
{
    public static void Display(int iValue)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.println(iCnt);
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the frequency for numbers printing:");

        int iSize = sc.nextInt();

        Display(iSize);
    }
}