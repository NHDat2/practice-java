/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

import java.lang.*;

public class ArrayIndexOfBoundException
{
	/**
	* IndexOutOfBoundsException method is use to throws error
	* @param none
	*/
	public static void IndexOfBoundException() throws java.lang.ArrayIndexOutOfBoundsException
	{
		int[] ar = {1, 2};
		ar[2] = 5;
		//throw new java.lang.ArrayIndexOutOfBoundsException("loi truy cap phan tu");
	}
	/**
	* main method use to run and test ArrayIndexOutOfBoundsException
	* @param args[]
	*/
	public static void main(String[] args)
	{
		try
		{
			IndexOfBoundException();
		} catch(java.lang.ArrayIndexOutOfBoundsException e)
		{
			System.out.print("loi truy cap phan tu");
		}
	}
}