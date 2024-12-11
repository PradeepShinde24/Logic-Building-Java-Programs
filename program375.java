// Taking String from user and take on word & find the how many times that word in string.
import java.util.*;

class program375
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sobj.nextLine();
        
        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        String Arr[] = str.split(" ");

        System.out.println("Enter the word that you want to search :");
        String Word = sobj.nextLine();

        int iFrequency = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)                  //for each loop
        {
            if(Arr[iCnt].equals(Word))
            {
                iFrequency++;
            }
        }
        System.out.println("Frequency of india word is: "+iFrequency);
    }
}