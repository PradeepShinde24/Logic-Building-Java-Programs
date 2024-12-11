/*
   Input: 
   Row : 3
   Col : 5

   Output:
   a   a   a   a   a
   b   b   b   b   b
   c   c   c   c   c
   
*/

import java.util.*;

class Program116
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1, ch = 'a'; i <= iRow; i++, ch++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch + "\t");
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

        Program116 obj = new Program116();
        obj.Display(iRow, iColumn);
    }
}