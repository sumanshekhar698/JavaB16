package com.java.advanced.io.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerializatiuon {

	public static void main(String[] args) throws IOException {
		Student sam = new Student("SAM", 20);
		System.out.println(sam);

		String path1 = "C:\\Users\\suman\\eclipse-workspace\\JavaB16\\notes\\sample_object_write.txt";

		File file = new File(path1);

		if (file.exists()) {

			try (FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				oos.writeObject(sam);

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
