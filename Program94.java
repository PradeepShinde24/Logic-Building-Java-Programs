// Pattern Printing--> I: 5, O: # # # # # 

// Input : 7
// Output : #  #  #  #  #  #  # 

import java.util.*;

class Program94
{
    public void Display(int iFrequency)
    {
        for(int iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.print("#\t");
        }
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the frequency of the symbol: ");
        int iFrequency = sc.nextInt();

        Program94 obj = new Program94();
        obj.Display(iFrequency);

    }
}