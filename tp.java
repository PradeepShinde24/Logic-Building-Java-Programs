// A java program to demonstrate use of
// static keyword with methods and variables
import java.util.*;

class StaticDemo 
{
	public static void main(String[] args)
	{
		tp.setCllg("XYZ");

		tp s1 = new tp("Alice");
		tp s2 = new tp("Bob");

		s1.getStudentInfo();
		s2.getStudentInfo();
	}
}
class tp 
{
    String name;
	int rollNo;

	static String cllgName;
	static int counter = 0;

	public tp(String name)
	{
		this.name = name;

		this.rollNo = setRollNo();
	}

	static int setRollNo()
	{
		counter++;
		return counter;
	}

	static void setCllg(String name)
     { 
        cllgName = name; 
    }

	void getStudentInfo()
	{
		System.out.println("name : " + this.name);
		System.out.println("rollNo : " + this.rollNo);
		System.out.println("cllgName : " + cllgName);
	}
}

