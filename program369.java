// Take string from user and remove the greater than 2 white spaces  (First and Last also remove in this)
import java.util.*;

class program369
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+", " ");

        str = str.trim();

        System.out.println("Updated Tsring is:" +str);
    }
}

