/*
   Input: 
   Row : 6
   Col : 6

   Output:
   %  *  *  *  *  *
   *  %  @  @  @  *
   *  #  %  @  @  *
   *  #  #  %  @  *
   *  #  #  #  %  *
   *  *  *  *  *  %

*/

import java.util.*;

class Program142
{
    public static void Display(int iRow, int iCol)
    {
        int  i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid Input....Please Enter the same value of rows and columns");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j)
                {
                    System.out.print("%\t");
                }
                else if((i == 1) || (i == iRow) || (j == 1) || (j == iCol))
                {
                    System.out.print("*\t");
                }
                else if(i <= j)
                {
                    System.out.print("@\t");
                }
                else
                {
                    System.out.print("#\t");
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