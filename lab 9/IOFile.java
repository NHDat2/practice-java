/**
* IOFile
* @author Nguyen Huu Dat
* @version 1.0
*/

import java.io.*;
import java.util.*;
public class IOFile
{
	/**
	* readContentFromFile
	* @param path
	* @return String
	*/
	public static String readContentFromFile(String path)
	{
		String result = "";
		File file = new File(path);
		try(Scanner scan = new Scanner(file))
		{
			while(scan.hasNext())
			{
				String data = scan.nextLine();
				result += data;
			}
		}catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		return result;
	}
/**
* writeContentToFile_removeFileIsavailable
* @param path
* @return none
*/
public static void writeContentToFile_removeFileIsavailable(String path)
{
	Scanner scan = new Scanner(System.in);
	File file = new File(path);
	try(PrintWriter pw = new PrintWriter(file))
	{
		boolean exit = false;
		while (true)
		{
			System.out.println("\n-----------Menu----------");
			System.out.println("1. Enter your text want to add the file");
			System.out.println("   Press any Key to break");
			System.out.print("Enter the choose : ");
			int choose = scan.nextInt();
			switch (choose)
			{
				case 1:
				{
					System.out.print("Enter your text : ");
					scan.nextLine();
					String spw = scan.nextLine();
					pw.println(spw);
					break;
				}
				default:
				{
					exit = true;
					break;
				}
			}
			
			if (exit)
			{
				break;
			}
		}

	}catch(Exception e)
	{
		System.out.print(e.getMessage());
	}
}
/**
* writeContentToFile_addMoreIntoFileIsavailable
* @param path
* @return none
*/
public static void writeContentToFile_addMoreIntoFileIsavailable(String path)
{
	Scanner scan = new Scanner(System.in);
	File file = new File(path);
	try(/** FileWriter dung de dinh dang file doc vao
		* @param file la ten file duoc ghi ra
		* @param true la de danh dau la con tro file dang o cuoi file va co the ghi tiep vao file neu file co san 
		*/
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bf = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bf))
	{
		boolean exit = false;
		while (true)
		{
			System.out.println("\n-----------Menu----------");
			System.out.println("1. Enter your text want to add the file");
			System.out.println("   Press any Key to break");
			System.out.print("Enter the choose : ");
			int choose = scan.nextInt();
			switch (choose)
			{
				case 1:
				{
					System.out.print("Enter your text : ");
					scan.nextLine();
					String spw = scan.nextLine();
					pw.println(spw);
					break;
				}
				default:
				{
					exit = true;
					break;
				}
			}
			
			if (exit)
			{
				break;
			}
		}

	}catch(Exception e)
	{
		System.out.print(e.getMessage());
	}
}
/**
* findFileByName
* @param folderPath
* @param fileName
* @return File
*/
public static File findFileByName(String folderPath, String fileName)
{
	File folder = new File(folderPath);
	File file = new File(fileName);
	for (File f : folder.listFiles())
	{
		if (f.getName().equals(fileName))
		{
			System.out.println("File is found");
			return file;
		}
	}
	System.out.println("File's not found - return null");
	return null;
}

	/**
	* main
	* @param args
	* @return none
	*/
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the path to file : ");
		String path = scan.nextLine();
		/*String result = readContentFromFile(path);
		System.out.print(result);*/

		writeContentToFile_addMoreIntoFileIsavailable(path);
		//writeContentToFile_addMoreIntoFileIsavailable(path);

/*
		System.out.print("Enter the folderPath : ");
		String folderPath = scan.nextLine();
		System.out.print("Enter the filePath : ");
		String fileName = scan.nextLine();
		File fileResult = findFileByName(folderPath, fileName);
		*/
		//findFileByName(folderPath, fileName);
	}
}