package com.java.advanced.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainDeSerialization {

	public static void main(String[] args) throws IOException {

		String path1 = "C:\\Users\\suman\\eclipse-workspace\\JavaB16\\notes\\sample_object_write.txt";

		File file = new File(path1);

		if (file.exists()) {

			try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {
				Student st = (Student) ois.readObject();
				System.out.println(st);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			file.createNewFile();
			System.out.println("INVALID PATH!!");
		}

	}

}
