/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/


import java.io.*;

public class IOException 
{
	/**
	* file() method catch and throws exception input, output file
	*/
	public static void file() throws java.io.IOException
	{
		throw new java.io.IOException("loi input output file");
	}

	public static void main(String[] args) {
		try
		{
			file();
		}catch(java.io.IOException e)
		{
			System.out.print(e.getMessage());
		}
	}
}