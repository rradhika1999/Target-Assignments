import java.io.*;
import java.util.*;
public class TwoMethods extends Exception
{
	String a= null;
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
	String method2()throws NullPointerException
	{
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
