// Take string from input and count the number of z occures in string

import java.util.*;

class Program167
{
    public int Countz(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 'z')
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

        Program167 obj = new Program167();
        int iRet = obj.Countz(str);

        System.out.println("Number of z letters are: "+iRet);
    }
}