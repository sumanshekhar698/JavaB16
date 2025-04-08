package com.java.advanced.io;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		String path1 = "C:\\Users\\suman\\eclipse-workspace\\JavaB16\\notes\\sample.txt";
		String path2 = "C:\\Users\\suman\\eclipse-workspace\\JavaB16\\notessss";


		File file = new File(path2);

		if (file.exists()) {
			
			System.out.println("File ? "+file.isFile());
			System.out.println("Directory ? "+file.isDirectory());
			System.out.println(file.getName());
			System.out.println(file.getParent());
			System.out.println(file.isHidden());
			
			System.out.println(file.getPath());
			System.out.println("Read ? "+file.canRead());
			System.out.println("Write ? "+file.canWrite());
			System.out.println("Execute ? "+file.canExecute());


		} else {
			System.out.println("INVALID PATH!!");
		}

	}

}
