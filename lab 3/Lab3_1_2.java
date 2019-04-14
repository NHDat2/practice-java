import java.util.Scanner;
import java.lang.Math;
/**
* Lab3_1_2 is a app. printing fibonaxi chain and showing result of sum, mul, sub, div and comparetion of 2 fraction
* @author Nguyen Huu Dat
* @version 1.0
* @since 18/09/2018
*/
public class Lab3_1_2
{
	/**
	* below is the main function --------
	* @param args don't use
	* @return main function don't return anything
	*/
	public static void main(String[] args)
	{
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Enter a, b to find greatest common divisor : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = greatestCommonDivisor(a, b);
		System.out.println(result);
		System.out.print("Enter n : ");
		int n = scan.nextInt();
		System.out.println("Sequence fibonaxi is : ");
		fibonaxi(n);*/

		PS a = new PS(-25, -15);
		PS b = new PS(5, 3);
		System.out.println(a.equals(b));

	}
	/**
	* below is the greatestCommonDivisor. Using to find greatest common divisor of 2 integer
	* @param a is integer
	* @param b is integer
	* @return greatest common divisor of 2 parameter is passed to function
	*/
	public static int greatestCommonDivisor(int a, int b)
	{
		a = Math.abs(a);
		b = Math.abs(b);
		if (b == 0)
		{
			return a;
		}
		return greatestCommonDivisor(b, a % b);
	}
	/**
	* below is the fibonaxi. Using to find and print fibonaci chain
	* @param n is integer. integer is needed find fibonaci chain
	* @return void function don't return anything
	*/
	public static void fibonaxi(int n)
	{
		int prev = 0;
		int cur = 1;
		int next = 0;
		for (int i = 0; i < n; i++)
		{
			next = cur + prev;
			System.out.print(cur + " ");
			prev = cur;
			cur = next;	
		}
	}
}
/**
* belowing is class PS. initializating fraction and showing sum, sub, mul, div and comparetion fuctions of 2 fraction
*/
class PS
{
	public int numerator;
	public int denominator;
	/**
	* below is initialization fuction of a fraction
	* @param a is integer is numerator of fraction
	* @param b is integer is denominator of fraction
	*/
	public PS(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	/**
	* below is setNumerator fuction. setting value for numerator of fraction
	* @param a is integer is numerator of fraction
	* @return void fuction don't return anything
	*/
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}
	/**
	* below is setDenominator fuction. setting value for denominator of fraction
	* @param a is integer is denominator of fraction
	* @return void fuction don't return anything
	*/
	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
	/**
	* below is getNumerator fuction. getting numerator's value of fraction
	* @param none
	* @return numerator's value of fraction
	*/
	public int getNumerator()
	{
		return this.numerator;
	}
	/**
	* below is getDenominator fuction. setting denominator's value of fraction
	* @param none
	* @return denominator's value of fraction
	*/
	public int getDenominator()
	{
		return this.denominator;
	}
	/**
	* below is greatestCommonDivisor fuction. getting value of greatest commom divisor of 2 integer
	* @param a is integer
	* @param a is integer
	* @return value of greatest commom divisor of 2 integer
	*/
	public int greatestCommonDivisor(int a, int b)
	{
		a = Math.abs(a);
		b = Math.abs(b);
		if (b == 0)
		{
			return a;
		}
		return greatestCommonDivisor(b, a % b);
	}
	/**
	* below is minimalFraction fuction. using to minimal fraction
	* @param none
	* @return void fuction don't return anything
	*/
	public void minimalFraction()
	{
		int gcd = greatestCommonDivisor(numerator, denominator);
		this.setNumerator(this.getNumerator() / gcd);
		this.setDenominator(this.getDenominator() / gcd);
	}
	/**
	* blowing is sum fuction. Calculating sum of 2 fraction
	* @param b is a object of class PS
	* @return object of class PS is sum of 2 fraction
	*/
	public PS sum(PS b)
	{
		int temp_numerator = this.getNumerator() * b.getDenominator() + this.getDenominator() * b.getNumerator();
		int temp_denominator = this.getDenominator() * b.getDenominator();
		PS sumFraction = new PS(temp_numerator, temp_denominator);
		sumFraction.minimalFraction();
		return sumFraction;
	}
	/**
	* blowing is sum fuction. Calculating sub of 2 fraction
	* @param b is a object of class PS
	* @return object of class PS is sub of 2 fraction
	*/
	public PS sub(PS b)
	{
		int temp_numerator = this.getNumerator() * b.getDenominator() - this.getDenominator() * b.getNumerator();
		int temp_denominator = this.getDenominator() * b.getDenominator();
		PS subFraction = new PS(temp_numerator, temp_denominator);
		subFraction.minimalFraction();
		return subFraction;
	}
	/**
	* blowing is sum fuction. Calculating mul of 2 fraction
	* @param b is a object of class PS
	* @return object of class PS is mul of 2 fraction
	*/
	public PS mul(PS b)
	{
		int temp_numerator = this.getNumerator()  * b.getNumerator();
		int temp_denominator = this.getDenominator() * b.getDenominator();
		PS mulFraction = new PS(temp_numerator, temp_denominator);
		mulFraction.minimalFraction();
		return mulFraction;
	}
	/**
	* blowing is sum fuction. Calculating div of 2 fraction
	* @param b is a object of class PS
	* @return object of class PS is div of 2 fraction
	*/
	public PS div(PS b)
	{
		int temp_numerator = this.getNumerator()  * b.getDenominator();
		int temp_denominator = this.getDenominator() * b.getNumerator();
		PS divFraction = new PS(temp_numerator, temp_denominator);
		divFraction.minimalFraction();
		return divFraction;
	}
	/**
	* blowing is printResult fuction. Printing result of fuctions such as sum, sub, mul or div 2 fraction
	* @param none
	* @return string is result of process calculate sum, sub, mul or div 2 fraction
	*/
	public String printResult()
	{
		if (this.getDenominator() < 0 && this.getNumerator() < 0)
		{
			return this.getNumerator() * -1 + "/" + this.getDenominator() * -1;
		}
		if (this.getDenominator() == 1)
		{
			return this.getNumerator() + "";
		}
		else if (this.getDenominator() == 0)
		{
			return "Invalid!";
		}
		else
		{
			return this.getNumerator() + "/" + this.getDenominator();
		}
	}
	/**
	* blowing is equals fuction. check 2 fraction have equal or haven't
	* @param b is a object of class PS
	* @return true or false
	*/
	public boolean equals(PS b)
	{
		this.minimalFraction();
		b.minimalFraction();
		if (Math.abs(this.getNumerator()) == Math.abs(b.getNumerator())&& Math.abs(this.getDenominator()) == Math.abs(b.getDenominator()))
		{
			return true;
		}
		return false;
	}
}