/*
   Input: 
   Row : 4
   Col : 4

   Output:
   *  @  @  @
   $  *  @  @   
   $  $  *  @   
   $  $  $  *   

*/

import java.util.*;

class Program134
{
    public static void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.print("Invalid Input....Please Enter the same value of rows and columns");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j)       
                {
                    System.out.print("*\t");
                }
                else if(i < j)                  // Uppar Triangle
                {
                    System.out.print("@\t");
                }
                else                           // Lower Triangle
                {
                    System.out.print("$\t");
                }
            }
            System.out.print("\n");
            System.out.print("\n");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int iRow = sc.nextInt();
        
        System.out.print("Enter the number of column: ");
        int iCol = sc.nextInt();
        
        Display(iRow, iCol);
    }
}