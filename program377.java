// Taking String from user and reverse the string. (By default function)
import java.util.*;

class program377
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sobj.nextLine();

        StringBuffer sbobj = new StringBuffer(str);

        sbobj = sbobj.reverse();

        System.out.println(sbobj);
    }
}