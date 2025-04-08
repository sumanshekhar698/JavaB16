package com.java.advanced.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTheFileContents {

	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\suman\\eclipse-workspace\\JavaB16\\notes\\sample.txt";

		File file = new File(path1);

		if (file.exists()) {

			try (FileInputStream fis = new FileInputStream(file);) {

				int chatInt;
				while ((chatInt = fis.read()) != -1) {
					System.out.print((char) chatInt);

				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("INVALID PATH!!");
		}

	}

}
