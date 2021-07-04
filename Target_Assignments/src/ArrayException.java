import java.io.*;
import java.util.*;
public class ArrayException extends Exception 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int position, size;
		System.out.println("Enter the size of the array: ");
		size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in the arrray: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		try
		{
			System.out.println("Enter the position: ");
			position = sc.nextInt();
			System.out.println("Element in the given position is: "+a[position-1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter a valid position");
			System.out.println("Note: The position value should vie from 1 to "+size);
		}
	}
}
