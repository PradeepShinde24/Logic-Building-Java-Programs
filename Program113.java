/*
   Input: 
   Row : 3
   Col : 5

   Output:
   *  *  *  *  *
   *  *  *  *  *
   *  *  *  *  *

*/

import java.util.*;

class Program113
{
    public void Display(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int iRow = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int iColumn = sc.nextInt();

        Program113 obj = new Program113();
        obj.Display(iRow, iColumn);
    }
}