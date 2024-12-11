/*
   Input: 
   Row : 3
   Col : 5

   Output:
   1  1  1  1  1  
   2  2  2  2  2  
   3  3  3  3  3  
   
*/

import java.util.*;

class Program114
{
    public static void Display(int iRow, int iColumn)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iColumn; j++)
            {
                System.out.print(i + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Rows: ");
        int iRow = sc.nextInt();

        System.out.print("Enter the number of Columns: ");
        int iColumn = sc.nextInt();

        Display(iRow, iColumn);
    }
}