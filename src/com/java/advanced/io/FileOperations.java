package com.java.advanced.io;

import java.io.File;
import java.io.IOException;

public class FileOperations {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\suman\\eclipse-workspace\\JavaB16\\notes\\new.txt";

		
		File file = new File(path1);

		if (file.exists()) {

			System.out.println("File ? " + file.isFile());
			System.out.println("Directory ? " + file.isDirectory());
			System.out.println(file.getName());
			System.out.println(file.getParent());
			System.out.println(file.isHidden());

			System.out.println(file.getPath());
			System.out.println("Read ? " + file.canRead());
			System.out.println("Write ? " + file.canWrite());
			System.out.println("Execute ? " + file.canExecute());
			
			boolean deleteStatus = file.delete();
			System.out.println("File Deletion : " + deleteStatus);


		} else {
			try {
				boolean status = file.createNewFile();
				System.out.println("File Creation : " + status);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
