// Take string from input and find the number of Capital letters.-----> Using charAt() method

import java.util.*;

class Program163
{

    public int CountCapital(String str)
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt) >= 'A') && (str.charAt(iCnt) <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");

        String str = sc.nextLine();

        Program163 obj = new Program163();
        int iRet = obj.CountCapital(str);

        System.out.println("Number of Capital Letter is: " +iRet);
    }
}