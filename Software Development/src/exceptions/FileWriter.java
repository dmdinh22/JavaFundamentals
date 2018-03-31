package exceptions;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {
	try {
		FileWriter fileWriter = new FileWriter("test.txt", true);
		PrintWriter printer = new PrintWriter(fileWriter);
		
		printer.println("some words");
		printer.flush();
	}
	catch (IOException e) {
		e.printStackTrace();
	}
}
