// Take Input from user and Display the Odd number from the array

import java.util.*;

class Program78
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elemnts: ");
        int iSize = sc.nextInt();

        ArrayX obj = new ArrayX(iSize);
        obj.Accept();        
        obj.OddDisplay();        
    }
} 

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }
    }

    public void OddDisplay()
    {
        System.out.println("Odd Numbers: ");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2) != 0)
            {
                System.out.print(Arr[iCnt] + "\t");
            }
        }
    }
}