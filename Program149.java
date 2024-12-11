/*
   Input: 
   Row : 4
   Col : 4

   Output:
             *
          *  *
       *  *  *
    *  *  *  *
    *  *  *  *
       *  *  *
          *  *
             *

*/

import java.util.*;

class Program149
{
    public static void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Inavlid Input");
        }

        for(i = iRow; i >= 1; i--)          
        {
            for(j = 1; j <= iCol; j++)      
            {
                if(i <= j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.print("\n");
        }

        for(i = iRow; i >= 1; i--)          
        {
            for(j = iCol; j >= 1; j--)      
            {
                if(i >= j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int iRow = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int iCol = sc.nextInt();

        Display(iRow, iCol);
    }
}