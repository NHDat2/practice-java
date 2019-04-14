import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;
/**
	@ Buil junit with cmd
	* javac -cp junit-4.12.jar;. Lab4OOPTest.java
 	* java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore Lab4OOPTest
*/

/**
* class Lab4OOPTest is a app. Using test and check accuracy of methods of class Lab4OOP
* @author Nguyen Huu Dat
* @version 1.0
* @since 25/09/2018
*/

public class Lab4OOPTest
{

	/**
	* testLargestNumber is a methods is uesed test methods LargestNumber in class Lab4OOP
	* @param none
	* @return none
	*/
	@Test
	public void testLargestNumber1()
	{
		Lab4OOP largestNumber = new Lab4OOP();
		/*Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();*/
		int result1 = largestNumber.largestNumber(1, -22);
		
		
		
		/*int max = 0;
		if (x > y)
		{
			max = x;
		}
		else
		{
			max = y;
		}*/
		assertEquals(1/*max*/, result1);
		
		
		
		
	}
	@Test
	public void testLargestNumber2()
	{
		Lab4OOP largestNumber = new Lab4OOP();
		int result2 = largestNumber.largestNumber(8, -8);
		assertEquals(8/*max*/, result2);
	}

	@Test
	public void testLargestNumber3()
	{
		Lab4OOP largestNumber = new Lab4OOP();
		int result3 = largestNumber.largestNumber(52, 42);
		assertEquals(52/*max*/, result3);
	}

	@Test
	public void testLargestNumber4()
	{
		Lab4OOP largestNumber = new Lab4OOP();
		int result4 = largestNumber.largestNumber(-5, 88);

		assertEquals(88/*max*/, result4);
	}

	@Test
	public void testLargestNumber5()
	{
		Lab4OOP largestNumber = new Lab4OOP();
		int result5 = largestNumber.largestNumber(-168, 2);
		assertEquals(2/*max*/, result5);
	}

	/**
	* testSmallestNumberInArray is a methods is uesed test methods SmallestNumberInArray in class Lab4OOP
	* @param none
	* @return none
	*/
	@Test
	public void testSmallestNumberInArray()
	{
		Lab4OOP smallestNumber = new Lab4OOP();
		int[] ar1 = {1, 2, 44, -5, 66, -9, 234, 455, 788, -345, -68, 0, 11, 67, 1000, 299, -88};
		int result1 = smallestNumber.smallestNumberInArray(ar1);
		assertEquals(-345, result1);
	}

	@Test
	public void testSmallestNumberInArray2()
	{
		Lab4OOP smallestNumber = new Lab4OOP();
		int[] ar2 = {5, 12, 121, 95, 425, 9103, 1744, 755, 588, 345, 78, 0, 11, 77, 52000, 5299, 28};
		int result2 = smallestNumber.smallestNumberInArray(ar2);
		assertEquals(0, result2);
	}

	@Test
	public void testSmallestNumberInArray3()
	{
		Lab4OOP smallestNumber = new Lab4OOP();
		int[] ar3 = {0, 72, -4154, 845, 2125, 42103, 1744, 855, 488, -245, -78, 0, 11, 87, 3200, 25999, -210};
		int result3 = smallestNumber.smallestNumberInArray(ar3);
		assertEquals(-4154, result3);
		
	}

	@Test
	public void testSmallestNumberInArray4()
	{
		Lab4OOP smallestNumber = new Lab4OOP();
		int[] ar4 = {-99, 82, 751, 55, 665, -9103, 1744, 955, 388, -145, -78, 0, 11, 57, 1250, 459, -22};
		int result4 = smallestNumber.smallestNumberInArray(ar4);
		assertEquals(-9103, result4);
		
	}

	@Test
	public void testSmallestNumberInArray5()
	{
		Lab4OOP smallestNumber = new Lab4OOP();
		int[] ar5 = {402, 322, 201, 455, 325, 503, 1744, 555, 188, 245, 68, 10, 71, 27, 8000, 799, 287};
		int result5 = smallestNumber.smallestNumberInArray(ar5);
		assertEquals(10, result5);

	}
	/**
	* testBMI is a methods is uesed test methods BMI in class Lab4OOP
	* @param none
	* @return none
	*/
	@Test
	public void testBMI()
	{
		Lab4OOP bmi = new Lab4OOP();

		String result1 = bmi.BMI(1.78, 68);
		
		
		
		

		assertEquals("binh thuong", result1);
		
		
		
		
	}
	@Test
	public void testBMI2()
	{
		Lab4OOP bmi = new Lab4OOP();
		String result2 = bmi.BMI(1.75, 84);
		assertEquals("beo phi", result2);
	}

	@Test
	public void testBMI3()
	{
		Lab4OOP bmi = new Lab4OOP();
		String result3 = bmi.BMI(1.50, 50);
		assertEquals("binh thuong", result3);
	}

	@Test
	public void testBMI4()
	{
		Lab4OOP bmi = new Lab4OOP();
		String result4 = bmi.BMI(1.60, 62);
		assertEquals("Thua can", result4);
	}

	@Test
	public void testBMI5()
	{
		Lab4OOP bmi = new Lab4OOP();
		String result5 = bmi.BMI(1.72, 60);
		assertEquals("binh thuong", result5);
	}
}