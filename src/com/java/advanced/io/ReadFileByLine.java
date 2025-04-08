package com.java.advanced.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileByLine {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\suman\\eclipse-workspace\\JavaB16\\notes\\sample.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			int lineNumber = 1;
			while ((line = br.readLine()) != null) {
//				System.out.println("Line " + lineNumber + ": " + line);
				System.out.println(line);

				// You can process each 'line' here as needed
				lineNumber++;
			}
//			System.out.println("Successfully read the file.");
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}
	}
}