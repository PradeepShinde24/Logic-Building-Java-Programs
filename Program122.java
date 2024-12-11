/*
   Input: 
   Row : 4
   Col : 4

   Output:
   1  2  3  4 
   *  *  *  *  
   1  2  3  4   
   *  *  *  *  
   

*/

import java.util.*;

class Program122
{
    public static void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i%2) == 0)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(j + "\t");
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
        int iColumn = sc.nextInt();

        Display(iRow, iColumn);
    }
}