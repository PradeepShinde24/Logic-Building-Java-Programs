// Take a string from user and Count the small and Capital characters.----> Using charAt() method
import java.util.*;

class program355
{
    public static void main(String Arg [])
    {
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        int iRet = obj.CountSmall(name);
        System.out.println("Number of small character are: " +iRet);

        iRet = obj.CountCapital(name);
        System.out.println("Number of capital character are: " +iRet);
    }
}

class StringX
{
    public int CountSmall(String str)
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt) >= 'a') && (str.charAt(iCnt) <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountCapital(String str)
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            if((str.charAt(iCnt) >= 'A') && (str.charAt(iCnt) <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}