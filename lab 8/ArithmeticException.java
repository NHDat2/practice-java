/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

public class ArithmeticException
{
	/**
	* divide method is use to divide 2 number
	*/
	public static void divide() throws java.lang.ArithmeticException
	{
		int a = 10 / 0;
		//throw new java.lang.ArithmeticException("loi chia cho 0");
	}
	/**
	* main method use to run and test ArithmeticException
	* @param args[]
	*/
	public static void main(String[] args)
	{
		try
		{
			divide();
		}catch(java.lang.ArithmeticException e)
		{
			System.out.print("loi chia cho 0");
		}
	}
}