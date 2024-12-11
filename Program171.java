// Take two input as string & character and Find the First Occurance of that characteer in string

import java.util.*;

class Program171
{
    public int FirstOcc(String str, char ch)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;
        int iPos = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                iPos = iCount;
                break;
            }
            Arr[iCnt]++;
            iCount++;
        }
        return iPos;
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);

        Program171 obj = new Program171();
        int iRet = obj.FirstOcc(str, ch);

        System.out.println("First occurance of " +ch +" character is at " +iRet+" Index");
    }
}