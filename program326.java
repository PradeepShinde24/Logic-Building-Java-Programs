// Addition of two numbers  

import java.util.*;

class program326
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int iNo1 = sobj.nextInt();
        
        System.out.println("Enter First Number: ");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNo1 + iNo2;

        System.out.println("Addition is:" + iAns);
    }
}