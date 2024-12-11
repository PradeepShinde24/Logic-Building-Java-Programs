// Take two number form user and display the element of array (Approach 1)   here we used the length property
import java.util.*;

class program344
{
    public void Accept(iSize)
    {
        public int Arr[];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display(int Arr[iSize])
    {
        public int Arr[];

        System.out.println("Elements array are: ");

        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt] + "\t");
        }
        System.out.println();
    }

    public  void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Elements: ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        program344 aobj = new program344();

        aobj.Accept(int Arr[iSize]);
        aobj.Display(int Arr[iSize]);
        
        // System.out.println("Enter the elements: ");
        // int iCnt = 0;

        // for(iCnt = 0; iCnt < Arr.length; iCnt++)
        // {
        //     Arr[iCnt] = sobj.nextInt();
        // }

        // System.out.println("Elements of array are: ");    
        // for(iCnt = 0; iCnt < Arr.length; iCnt++)
        // {
        //     System.out.println(Arr[iCnt]);
        // }
    }

}