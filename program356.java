// Take a string from user and Convert the string capital character into smaller character
import java.util.*;

class program356
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        
        String sret = obj.StrLower(name);
        System.out.println("Converted string is : "+sret);
    }
}

class StringX
{
    public String StrLower(String str)
    {
        // Step 1 : Convert String to array
        char Arr[] = str.toCharArray();

        // Step 2 : Perform operations on array
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }

        // Step 3 : Convert array to string
        String ret = new String(Arr);

        return ret;
    }
}