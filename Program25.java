// Take number from user to find the sum of factor of that number: 

import java.util.*;

// class Program25
// {
//     public static void main(String Arg[])
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number");
//         int iNo = sc.nextInt();

//         Number obj = new Number();

//         int iRet = obj.SumFactors(iNo);
//         System.out.println("Sum of the factors is: " +iRet);
//     }
// }

// class Number
// {
//     public int SumFactors(int iValue)
//     {
//         int iCnt = 0;
//         int iSum = 0;

//         for( iCnt = 1; iCnt <= iValue; iCnt++)         // Time Complexity is N 
//         {
//             if((iValue % iCnt) == 0)
//             {
//                 iSum = iSum + iCnt;
//             }
//         }
//         return iSum;
//     }
// }

class Program25
{
    public static int SumFactors(int iValue)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            if((iValue % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int iNo = sc.nextInt();

        int iRet = SumFactors(iNo);

        System.out.println("Sum of factor are: "+iRet);
    }
}