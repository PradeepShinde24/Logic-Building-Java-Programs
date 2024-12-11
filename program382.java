// Take two String from user and check the string are anagram
import java.util.*;

class program382
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String:");
        String str1 = sobj.nextLine();

        System.out.println("Enter Second String:");
        String str2 = sobj.nextLine();

        str1  =  str1.toLowerCase();
        str2  =  str2.toLowerCase();

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        int Freq1[] = new int[26];
        int Freq2[] = new int[26];

        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Freq1[Arr[iCnt] - 'a']++;
        }

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Freq2[Brr[iCnt] - 'a']++;
        }

        for(iCnt = 0; iCnt < Freq1.length; iCnt++)
        {
            if(Freq1[iCnt] != Freq1[iCnt])
            {
                break;
            }
        }

        if(iCnt == Freq1.length)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");   
        }
    }
}

