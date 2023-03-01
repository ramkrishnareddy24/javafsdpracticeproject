package javafsdpracticeproject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AP316FileHandlingReadFile {
	
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
	
	public static void main(String[] args) {
		List l = readFileList("C:\\Users\\rkannari\\File\\test1.txt");
		
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
