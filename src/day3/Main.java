package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main
{
	public static void main(String[] args)
	{
		File file = new File("student.txt");

		if (!file.exists())
		{
			BufferedWriter bw = null;
			try
			{
				Student david = new Student("David", "Phoenix", "Arizona");
				bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
				bw.write(david.toString());
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
				try
				{
					if (bw != null)
						bw.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		else
		{
			BufferedReader br = null;
			try
			{
				br = new BufferedReader(new FileReader(file));
				Student newStudent = new Student(br.readLine(), br.readLine(), br.readLine());
				System.out.println(newStudent);
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
				try
				{
					if (br != null)
						br.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}