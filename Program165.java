// Take string from input and count the number of Vowels(a, e, i, o ,u : A, E, I, O, U).

import java.util.*;

class Program165
{
    public int CountVowels(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] == 'a') || (Arr[iCnt] == 'e') || (Arr[iCnt] == 'i') || (Arr[iCnt] == 'o') || (Arr[iCnt] == 'u') || (Arr[iCnt] == 'A') || (Arr[iCnt] == 'E') || (Arr[iCnt] == 'I') || (Arr[iCnt] == 'O') || (Arr[iCnt] == 'U'))
            {
                iCount++;
            }
        }
        return iCount;
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        Program165 obj = new Program165();
        int iRet = obj.CountVowels(str);

        System.out.println("Number of the Vowels is: "+iRet);
    }
}