/*
   Input: 
   Row : 6
   Col : 6

   Output:
   A    
   A  B   
   A  B  C  
   A  B  C  D  
   A  B  C  D  E
   A  B  C  D  E  F

*/

import java.util.*;

class Program140
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

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'A'; j <= iCol; j++, ch++)
            {
                if(i >= j)
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