/**
* @author Nguyen Huu Dat
* @version 1.0
* @since 23-10-2018
*/

import java.io.*;

public class FileNotFoundException
{
	/**
	* FileException catch and throws error about don't find file
	*/
	public static void FileException() throws java.io.FileNotFoundException
	{
		//throw new java.io.FileNotFoundException("khong tim thay file");
	}
	/**
	* main method run and catch error don't find file
	*/
	public static void main(String[] args) {
		try
		{
			FileException();
			File path = new File("dsfsd.txt");
			FileReader readFile = new FileReader(path);
			BufferedReader buffer = new BufferedReader(readFile);
		}catch(java.io.FileNotFoundException e)	
		{
			System.out.print("Loi khong tim thay file");
		}
	}
}