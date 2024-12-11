/*
   Input: 
   Row : 6
   Col : 6

   Output:
   *  a  a  a  a  a
   b  *  b  b  b  b
   c  c  *  c  c  c
   d  d  d  *  d  d
   e  e  e  e  *  e
   f  f  f  f  f  *

*/

import java.util.*;

class Program141
{
    public static void Display(int iRow, int iCol)
    {
        int  i = 0, j = 0;
        char ch = '\0';

        if(iRow != iCol)
        {
            System.out.println("Invalid Input....Please Enter the same value of rows and columns");
            return;
        }

        for(i = 1, ch = 'a'; i <= iRow; i++, ch++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == j)
                {
                    System.out.print("*\t");
                }
                else 
                {
                    System.out.print(ch + "\t");
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