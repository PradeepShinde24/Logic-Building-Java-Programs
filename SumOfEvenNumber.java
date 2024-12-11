import java.util.*;
import java.lang.*;

public class SumOfEvenNumber
{	
	static int evenSum(int n)
	{
		int curr = 2;
		int sum = 0;

		for (int i = 1; i <= n; i++)
		{
			sum += curr;
			curr += 2;
		}
		return sum;	
	}

	public static void main(String argc[])
	{
		int n = 1000;
		System.out.println("Sum of first " + n + " Even numbers is: " +evenSum(n));
	}
}
