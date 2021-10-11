import java.util.*;
public class Shape extends Exception
{
	// Static initialization of variables
	static int length, width;
	
	// Function definition of isSquare method to check if square
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
		// Object creation of scanner class
		Scanner sc = new Scanner (System.in);
		// Object creation of Shape class
		Shape s = new Shape();
		System.out.print("Enter the length: ");
		length = sc.nextInt();
		System.out.print("Enter the width: ");
		width = sc.nextInt();
		try 
		{
			// Method invokation using object
			s.isSquare(length,width);
		}
		catch(RuntimeException r)
		{
			System.out.println(r.getMessage());
		}
	}
}
