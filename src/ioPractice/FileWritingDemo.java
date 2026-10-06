

package ioPractice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {
	
	public static void main(String[] args) {
		
		try {
	        FileWriter writer = new FileWriter("output.txt");
	        
	        writer.write("Welcome to Java I/O \nJava is a very powerful language.");
	        
	        writer.close();
	       

	    } catch (IOException e) {
	    	System.out.println("An error occurred: " + e.getMessage());
	    	
	    }
	}
	
}
