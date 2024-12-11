// Take matrix from user and Summation of each row
import java.util.*;

class program390
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0;

        System.out.println("Enter number of rows");
        iRow = sobj.nextInt();

        System.out.println("Enter number of coulmns");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol);
        mobj.Accept();
        mobj.Display();

        int iRet = mobj.Summation();
        System.out.println("Summation of the array elemnets are: "+iRet);

        mobj.SummationRow();
    }
}

class Matrix
{
    public int Arr[][];

    public Matrix(int i, int j)
    {
        Arr = new int[i][j];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements: ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements pf Matrix are: ");
        for(int i = 0; i < Arr.length; i++)      // Outer
        {
            for(int j = 0; j < Arr[i].length; j++)   // Inner
            {
                System.out.print(Arr[i][j] +"\t");
            }
            System.out.println();
        }
    }

    int Summation()
    {
        int iSum = 0;
        for(int i = 0; i < Arr.length; i++)      // Outer
        {
            for(int j = 0; j < Arr[i].length; j++)   // Inner
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }

    void SummationRow()
    {
        int iSum = 0;
        for(int i = 0; i < Arr.length; i++)      // Outer
        {
            for(int j = 0; j < Arr[i].length; j++)   // Inner
            {
                iSum = iSum + Arr[i][j];
            }
            System.out.println("Summmation of Row number: " +(i+1) + " is:" +iSum);
            iSum = 0;
        }
    }

}
