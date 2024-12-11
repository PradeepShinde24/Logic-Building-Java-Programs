import java.util.*;
import java.io.*;

class Program503
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name that you want to create: ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);                       // File class is inbuilt class

        boolean bRet = fobj.createNewFile();                  // createNewFile inbuilt method

        if(bRet == true)
        {
            System.out.println("File Succesfully created");
        }
        else
        {
            System.out.println("Unable to create file");
        }
    }
}