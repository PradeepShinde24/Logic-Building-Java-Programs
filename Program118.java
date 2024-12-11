/*
   Input: 
   Row : 3
   Col : 5

   Output:
   a   b   c   d   e
   a   b   c   d   e
   a   b   c   d   e
   
*/

import java.util.*;

class Program118
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'a'; j <= iCol; j++, ch++)
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

        Program118 obj = new Program118();
        obj.Display(iRow, iColumn);
    }
}