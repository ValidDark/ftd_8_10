package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main
{
	public static void main(String[] args)
	{
		File file = new File("student.txt");
		
		if(!file.exists())
		{
			BufferedWriter bw = null;
			try
			{
				Student david = new Student("David","Phoenix","Arizona");
				OutputStream out = new FileOutputStream(file);
				bw = new BufferedWriter(new OutputStreamWriter(out));
				bw.write(david.toString());
			} 
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
					try
					{
						bw.close();
					} catch (IOException e)
					{
						e.printStackTrace();
					}
			}
		}
			else
			{
				BufferedReader bw = null;
				try
				{
					bw = new BufferedReader(new FileReader(file));
					Student newStudent = new Student(bw.readLine(),bw.readLine(),bw.readLine());
					System.out.println(newStudent);
				} 
				catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}	
				finally
				{
					try
					{
						bw.close();
					} catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
	}
}
			
			
			

			
			
			
			
			

		