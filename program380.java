// Taking String from user and reverse the sequence
import java.util.*;

class program380
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sobj.nextLine();
        
        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        String Arr[] = str.split(" ");

        StringBuffer output = new StringBuffer();

        for(int iCnt = Arr.length-1; iCnt >= 0; iCnt--)
        {
            System.out.print(Arr[iCnt]);
        }

    }
}