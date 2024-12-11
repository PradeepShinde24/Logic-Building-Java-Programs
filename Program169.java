// Take two input as string and character and Count the number character (Solution 2)

import java.util.*;

class Program169
{
    public static void CountCharacter(String str, char ch)
    {
        int iCount = 0; 

        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt)) == ch)
            {
                iCount++;
            }
        }
        System.out.println("Number of the " +ch + " Charcter is "+iCount);
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.print("Enter the String: ");
        char ch = sc.next().charAt(0);

        CountCharacter(str, ch);
    }
}