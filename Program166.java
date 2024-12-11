// Take string from input and count the number of Spacebar.

import java.util.*;

class Program166
{
    public static void CountSpace(String str)
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(iCnt) == ' ')
            {
                iCount++;
            }
        }
        System.out.println("Number of SpaceBar are: "+iCount);
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        CountSpace(str);
    }
}