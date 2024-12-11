// Take two input as string and character and Count the number character (Solution 1)

import java.util.*;

class Program168
{
    public int CountCharacter(String str, char ch)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
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

        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);

        Program168 obj = new Program168();
        int iRet = obj.CountCharacter(str, ch);

        System.out.println("Number of the " + ch + " Character is " +iRet);
    }
}