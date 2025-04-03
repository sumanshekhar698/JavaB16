package com.java.exception_handling;

public class CheckedExceptions {

	public static void main(String[] args) {


		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(500);//Checked Exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
