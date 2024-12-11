// Take two input as string & character and Count the number of character in string (Solution 3)

import java.util.*;

class Program170
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);

        StringX obj = new StringX();
        int iRet = obj.CountCapital(str, ch);

        System.out.println("Number of the " +ch +" Character is: "+iRet);
    }
}

class StringX
{
    public int CountCapital(String str, char ch)
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
}