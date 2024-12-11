// Take string from input and find the number of small letters.-------> Using toCharArray() method 

// import java.util.*;

// class program162
// {
//     public static void main(String Arg [])
//     {
//         Scanner sobj =  new Scanner(System.in);

//         System.out.println("Enter your name: ");
//         String name = sobj.nextLine();

//         StringX obj = new StringX();
//         int iRet = obj.CountSmall(name);
//         System.out.println("Number of small character are: " +iRet);
//     }
// }

// class StringX
// {
//     public int CountSmall(String str)
//     {
//         char Arr[] = str.toCharArray();
//         int iCount = 0;

//         for(int iCnt = 0; iCnt < Arr.length; iCnt++)
//         {
//             if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
//             {
//                 iCount++;
//             }
//         }
//         return iCount;
//     }
// }


// other Method

import java.util.*;

class Program162
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z') )
            {
                iCount++;
            }
        }
        return iCount;
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        Program162 obj = new Program162();
        int iRet = obj.CountSmall(str);

        System.out.println("Number of Small letter is: " + iRet);
    }
}