package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args)
	{
		File file = new File("C:/workspace/day2/day3/src/day3/test.txt");
		
		BufferedReader read = null;
		try
		{
			read = new BufferedReader(new FileReader(file));
			System.out.println(read.readLine());

		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if ( read!= null)
			{
				try
				{
					read.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
