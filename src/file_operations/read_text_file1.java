package file_operations;

import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class read_text_file1 {

	public static void main(String args[]) throws IOException
	{
		File file = new File("C:\\Users\\Sagar\\eclipse-workspace\\CoreJava\\src\\file_operations\\file.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line="";
		while(line!= null)
		{
			line = br.readLine();
			
			if(line==null)
			{
				break;
			}
			System.out.println(line);
		}
	}
}
