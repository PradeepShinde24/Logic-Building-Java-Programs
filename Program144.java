/*
   Input: 
   Row : 4
   Col : 4

   Output:
   *  *  *  # 
   *  *  #  
   *  #  
   #  

*/

import java.util.*;

class Program144
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
                if(i == j)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
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

        Program144 obj = new Program144();
        obj.Display(iRow, iCol); 
    }
}