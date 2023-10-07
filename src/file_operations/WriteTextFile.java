package file_operations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String args[]) throws IOException
	{
		File file= new File("C:\\Users\\Sagar\\eclipse-workspace\\CoreJava\\src\\file_operations\\Wfile.txt");
		
		FileWriter fileWriter = new FileWriter(file,false);
		
		BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
		
		String contentToWrite = "Sagar Shinde";
		
		bufferedWriter.write(contentToWrite);
		
		bufferedWriter.close();
		fileWriter.close();
		file=null;
	}
}
