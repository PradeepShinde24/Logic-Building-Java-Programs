// Taking String from user and count the number of words (by split method)
import java.util.*;

class program372
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sobj.nextLine();
        
        str = str.replaceAll("\\s"," ");
        str = str.trim();

        String Arr[] = str.split(" ");
        System.out.println("Number of words are:" +Arr.length);
    }
}