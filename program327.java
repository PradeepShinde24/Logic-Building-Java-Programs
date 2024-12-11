// Addition of two numbers  (object closing)

import java.util.*;

class program327
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

        sobj.close();                             // object close.....it is not mendotory it's just warning means code is running
    } 
}