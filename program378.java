// Taking String from user and reverse the word at the same position
import java.util.*;

class program378
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

        for(String s : Arr)
        {
            StringBuffer word = new StringBuffer(s);
            output.append((word.reverse()).append(" "));
        }

        System.out.println("Result is: " +output);
    }
}