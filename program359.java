// Take a string from user and Convert the string smaller character into capital character (Toggle)----> Inline return
import java.util.*;

class program359
{
    public static void main(String Arg [])
    {
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        String sret = obj.StrLower(name);
        System.out.println("Converted string is: "+sret);

        String sret = obj.StrUpper(name);
        System.out.println("Converted string is: "+sret);

        String sret = obj.StrToggle(name);
        System.out.println("Converted string is: "+sret);
    }
}

class StringX
{
    public String StrLower(String str)
    {
        // Step 1: Convert string to array
        char Arr[] = str.toCharArray();

        // Step 2: Perform opertions on array
        for(int iCnt = 0; iCnt < Arr.length; iCnt++);
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }

        // Step 3: Convert array to String
        return new String(Arr);
    }

    public String StrUpper(String str)
    {
        // Step 1: Convert string to array
        char Arr[] = str.toCharArray();

        // Step 2: Perform opertions on array
        for(int iCnt = 0; iCnt < Arr.length; iCnt++);
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
        }

        // Step 3: Convert array to String
        return new String(Arr);
    }

    public String StrToggle(String str)
    {
        // Step 1: Convert string to array
        char Arr[] = str.toCharArray();

        // Step 2: Perform opertions on array
        for(int iCnt = 0; iCnt < Arr.length; iCnt++);
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
            else if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }

        // Step 3: Convert array to String
        return new String(Arr);
    }
}