package javafsdpracticeproject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class AP316FileHandlingCreateFile {
	public static void main(String[] args) throws IOException {
//		createFileUsingFileClass();
//		createFileUsingOutputStream();
		createFileIn_NIO();
	}
	
	private static void createFileUsingFileClass() throws IOException{
		
		File file = new File("C:\\Users\\rkannari\\File\\test1.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File already exists");
		}
		
		
		FileWriter writer = new FileWriter(file);
		writer.write("Test data");
		writer.close();
	}
	
	
	private static void createFileUsingOutputStream() throws IOException {
		String data = "Test data";
		FileOutputStream out = new FileOutputStream("C:\\Users\\rkannari\\File\\test2.txt");
		out.write(data.getBytes());
		out.close();
	}
	
	private static void createFileIn_NIO() throws IOException{
		String data = "Test data";
		Files.write(Paths.get("C:\\Users\\rkannari\\File\\test3.txt"),data.getBytes());
		List<String> lines = Arrays.asList("1st line","2nd line");
		
		Files.write(Paths.get("file6.txt"),lines,StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		
	}
	
}
