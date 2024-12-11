/*
    Input : 

    Row : 4
    Col : 4

    Output : 
    *   *   *   *
    *   *   *   
    *   *
    *
            
*/  

import java.util.*;

class Program143
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
        }

        for(i = iRow; i >= 1; i--)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the number of rows: ");
        int iRow = sc.nextInt();
    
        System.out.print("Enter the number of Columns: ");
        int iCol = sc.nextInt();
    
        Program143 obj = new Program143();
        obj.Display(iRow, iCol);
    }
}