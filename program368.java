// Take string from user and remove the greater than 2 white spaces
import java.util.*;

class program368
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s+", " ");

        System.out.println("Updated Tsring is:" +str);
    }
}

