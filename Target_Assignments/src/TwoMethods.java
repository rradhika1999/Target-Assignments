import java.io.*;
import java.util.*;
public class TwoMethods extends Exception
{
	// Initializing variable 'a' to null
	String a= null;
	
	// Method 1 declaration
	String method1()throws NullPointerException
	{
		try
		{
			method2();
		}
		catch(NullPointerException n)
		{
			throw new NullPointerException("Null Pointer Exception is thrown");
		}
		return "";
	}
	
	// Method 2 declaration
	String method2()throws NullPointerException
	{
		// String Comparision of 'a'
		if(a=="asdd")
		{
			System.out.println("Strings are different");
		}
		else
		{
			throw new NullPointerException();
		}
		return "";
	}
	public static void main(String[] args)throws NullPointerException
	{
		// Object creation
		TwoMethods t = new TwoMethods();
		try
		{
			t.method1();
		}
		catch(NullPointerException n)
		{
			System.out.println(n.getMessage());
		}
	}
}
