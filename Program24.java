// Take number from user to find the factor of that number: (Optimazation Code)

import java.util.*;

// class Program24
// {
//     public static void main(String Arg[])
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number");
//         int iNo = sc.nextInt();

//         Number obj = new Number();
//         obj.DisplayFactor(iNo);
//     }
// }

// class Number
// {
//     public void DisplayFactor(int iValue)
//     {
//         int iCnt = 0;

//         System.out.println("Factors are: ");
//         for( iCnt = 1; iCnt <= (iValue/2); iCnt++)         // Time Complexity is N/2
//         {
//             if((iValue % iCnt) == 0)
//             {
//                 System.out.println(iCnt);
//             }
//         }
//     }
// }

class Program24
{
    public void DisplayFactor(int iValue)
    {
        int iCnt = 0;

        System.out.println("Factors are: ");

        for(iCnt = 1; iCnt <= (iValue/2); iCnt++)
        {
            if((iValue % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int iSize = sc.nextInt();

        Program24 obj = new Program24();
        obj.DisplayFactor(iSize);
    }
}