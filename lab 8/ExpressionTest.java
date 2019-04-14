/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

public class ExpressionTest
{
	/**
	* main method
	* @param args[]
	*/
	public static void main(String[] args)
	{
		Numeral a = new Numeral(10);
		Numeral b = new Numeral(1);
		Numeral c = new Numeral(2);
		Numeral d = new Numeral(3);

		Square squa = new Square(a);
//(10^2  -  1 + 2*3)^2
		Subtraction sub = new Subtraction(squa, b);
		Multiplication mul = new Multiplication(c, d);
		Addition add = new Addition(sub, mul);
		Square squa2 = new Square(add);
		String result = squa2.toString();
		System.out.print(result);
		//Division div = new Division(a, b);

	}
}