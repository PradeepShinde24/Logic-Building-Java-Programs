// Take string from input and count the character.

import java.util.*;

class Program160
{
    public int StrlenX(String str)
    {
        return 0;
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        Program160 obj = new Program160();
        int iRet = obj.strlenX(str);

        System.out.println("Length of teh string is: " + iRet);

    }
}