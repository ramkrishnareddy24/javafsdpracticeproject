package javafsdpracticeproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class AP316FileHandlingProject {
	public static void main(String[] args) throws IOException {
		createFileUsingOutputStream();
		readFileList("C:\\Users\\rkannari\\File\\test4.txt");
		modifyFile("C:\\Users\\rkannari\\File\\test4.txt","Test","Data");
		
	}
	
	private static void createFileUsingOutputStream() throws IOException {
		String data = "Test data";
		FileOutputStream out = new FileOutputStream("C:\\Users\\rkannari\\File\\test4.txt");
		out.write(data.getBytes());
		out.close();
	}
	
	public static List<String> readFileList(String fileName){
		List<String> lines = Collections.emptyList();
		
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return lines;
	}
	
	static void modifyFile(String filePath,String oldString,String newString) {
		File fileToBeModified = new File(filePath);
		String oldContent = "";
		BufferedReader reader = null;
		FileWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			
			while(line!=null) {
				oldContent = oldContent + line + System.lineSeparator();
				line = reader.readLine();
			}
			
			String newContent = oldContent.replace(oldString, newString);
			writer = new FileWriter(fileToBeModified);
			writer.write(newContent);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
