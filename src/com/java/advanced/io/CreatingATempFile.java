package com.java.advanced.io;

import java.io.File;
import java.io.IOException;

public class CreatingATempFile {

	public static void main(String[] args) {
		File file = null;
		try {
			 file = File.createTempFile("temp", ".txt");
			System.out.println(file.exists());
			System.out.println(file.getAbsolutePath());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			file.deleteOnExit();
		}

	}

}
