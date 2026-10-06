

package ioPractice;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class FileReadingDemo {
	
	
	
	public static void main(String[] args) {
		
		try {
			
			FileReader reader = new FileReader("output.txt");
			
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;

			while ((line = bufferedReader.readLine()) != null) {
			    System.out.println(line);
			}
			
			
			bufferedReader.close();

		}	catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());

}

	}

}
