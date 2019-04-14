import java.util.Scanner;
import java.util.Arrays;

/**
* class Lab4OOP is a lab with methods find largest number, smallest number in array and calculate BMI index
* @author Nguyen Huu Dat
* @version 1.0
* @since 25/09/2018
*/

public class Lab4OOP
{
	/**
	* method largestNumber is find number larger than others
	* @param int a
	* @param int b
	* @return the number largest
	*/
	public static int largestNumber(int a, int b)
	{
		if (a > b)
		{
			return a;
		}
		return b;
	}
	/**
	* method smallestNumberInArray find the smallest number in array
	* @param int[] ar
	* @return the smallest number in array
	*/
	public static int smallestNumberInArray(int[] ar)
	{
		Arrays.sort(ar);
		return ar[0];
	}
	/**
	* method smallestNumberInArray find the smallest number in array
	* @param double height
	* @param double weight
	* @return string depend on BMI
	*/
	public static String BMI(double height, double weight)
	{
		double result = weight / (height * height);
		if (result < 18.5)
		{
			//System.out.println("Thieu can");
			return "Thieu can";
		}
		else if (result >= 23 && result <= 24.99)
		{
			System.out.println("Thua can");
			return "Thua can";
		}
		else if (result >= 18.5 && result <= 24.99)
		{
			System.out.println("binh thuong");
			return "binh thuong";
		}
		else if (result >= 25)
		{
			System.out.println("beo phi");
			return "beo phi";
		}
		return "No";
	}
}