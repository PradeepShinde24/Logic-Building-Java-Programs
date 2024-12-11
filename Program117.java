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

class Program117
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = 'a';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch + "\t");
            }
            ch++;
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

        Program117 obj = new Program117();
        obj.Display(iRow, iColumn);
    }
}