package com.java.advanced.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFile {

	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\suman\\eclipse-workspace\\JavaB16\\notes\\sample_write.txt";

		File file = new File(path1);
		String  msg = "Hey, I \n wrote a file \n \t Yayy!!! \n";

		if (file.exists()) {

			try (FileOutputStream fos = new FileOutputStream(file);) {
				fos.write(msg.getBytes());

			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			file.createNewFile();
			System.out.println("INVALID PATH!!");
		}

	}

}
