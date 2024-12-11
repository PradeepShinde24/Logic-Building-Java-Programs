// Take two input as string and character and Find First Occurance of that characteer (Without using break)

import java.util.*;

class Program173
{
    public int FirstOcc(String str, char ch)
    {
        char Arr[] = str.toCharArray();

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                return iCnt;
            }
        }
        return -1;
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        Program173 obj = new Program173();
        int iRet = obj.FirstOcc(str, ch);

        System.out.println("First occurance of " +ch +" character is at " +iRet+" Index");

    }
}