// Taking String from user and find the how many times india word in string.
import java.util.*;

class program373
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sobj.nextLine();
        
        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        String Arr[] = str.split(" ");

        int iFrequency = 0;
        for(String s : Arr)               //for each loop
        {
            if(s.equals("india"))
            {
                iFrequency++;
            }
        }
        System.out.println("Frequency of india word is: "+iFrequency);
    }
}