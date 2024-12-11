/*
   Input: 
   Row : 6
   Col : 6

   Output:
   *  *  *  *  *  *
   &  &  &  &  &  &
   &  &  &  &  &  &
   &  &  &  &  &  &
   &  &  &  &  &  &
   *  *  *  *  *  *

*/

import java.util.*;

class Program126
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid Input....Please Enter the same value of rows and columns");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i == 1) || (i == iRow))
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("&\t");
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

        System.out.print("Enter the number of column: ");
        int iCol = sc.nextInt();

        Program126 obj = new Program126();
        obj.Display(iRow, iCol);

    }
}