// Accept string from user and remove all white spaces and return the new string  (by direct inbuilt method so don't used that for company coding)
import java.util.*;

class program362
{
    public static void main(String Arg [])
    {
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        String sret =  obj.RemoveWhiteSpace(name);

        System.out.println("Result is:" +sret);
    }
}

class StringX
{
    public String RemoveWhiteSpace(String str)
    {
        return str.replaceAll("\\s","");
    }
}