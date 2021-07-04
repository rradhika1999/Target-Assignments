import java.util.*;
public class Shape extends Exception
{
	static int length, width;
	
	boolean isSquare(int length, int width)throws RuntimeException
	{
		if(length == width)
		{
			return true;
		}
		else
		{
			throw new RuntimeException("NotASquareException");
		} 
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		Shape s = new Shape();
		System.out.print("Enter the length: ");
		length = sc.nextInt();
		System.out.print("Enter the width: ");
		width = sc.nextInt();
		try 
		{
			s.isSquare(length,width);
		}
		catch(RuntimeException r)
		{
			System.out.println(r.getMessage());
		}
	}
}
