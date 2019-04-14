/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

public class CastException
{
	/**
	* CasttException method is use to catch ClassCastException error
	* @param none
	*/
	public static void CasttException() throws java.lang.ClassCastException
	{
		throw new java.lang.ClassCastException("loi cast");
	}
	/**
	* main method run and catch cast error
	* @param args[]
	*/
	public static void main(String[] args) {
		try
		{
			CasttException();
		}
		catch(java.lang.ClassCastException e)
		{
			System.out.print(e.getMessage());
		}
	}
}