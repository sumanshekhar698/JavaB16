package com.java.advanced.mutithreading;

public class Task implements Runnable{//Work

	@Override
	public void run() {//Work

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i + "" + Thread.currentThread());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}
	

}
