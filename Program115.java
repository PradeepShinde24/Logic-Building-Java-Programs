/*
   Input: 
   Row : 3
   Col : 5

   Output:
   1  2  3  4  5
   1  2  3  4  5
   1  2  3  4  5
   
*/

import java.util.*;

class Program115
{
    public void Display(int iRow, int iColumn)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iColumn; j++)
            {
                System.out.print(j + "\t");
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

        Program115 obj = new Program115();
        obj.Display(iRow, iColumn);
    }
}