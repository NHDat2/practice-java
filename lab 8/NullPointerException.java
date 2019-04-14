/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/


public class NullPointerException
{
	/**
	* NullException method catch and throw exception NullPointerException
	*/
	public static void NullException(String s) throws java.lang.NullPointerException
	{
		//throw new java.lang.NullPointerException("co 1 bien bat ki co gia tri la NULL co doi dai la null");
	}
	/**
	* Main method
	* @param args[]
	*/
	public static void main(String[] args)
	{
		try
		{
			String s = null;
			System.out.print(s.charAt(1));
		} catch(java.lang.NullPointerException e)
		{
			System.out.print("NULLPointerException");
		}
	}
}