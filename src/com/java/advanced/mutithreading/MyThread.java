package com.java.advanced.mutithreading;

public class MyThread extends Thread {// Worker

	@Override
	public void run() {// Work

		System.out.println("run << ");
		System.out.println("t1 :: " + Thread.currentThread().getState());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run >> ");

	}

}
