package com.java.advanced.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTheFileContents2 {

	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\suman\\eclipse-workspace\\JavaB16\\notes\\sample.txt";

		File file = new File(path1);

		if (file.exists()) {
			FileInputStream fis = null;
			try {
				 fis = new FileInputStream(file);
				int chatInt;
				while ((chatInt = fis.read()) != -1) {
					System.out.print((char) chatInt);

				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				fis.close();
			}

		} else {
			System.out.println("INVALID PATH!!");
		}

	}

}
