package com.java.advanced.mutithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START");

//		for (int i = 0; i < 10; i++) {
//			Thread.sleep(500);
//			System.out.println(i);
//		}

		System.out.println(Thread.currentThread());
		MyThread t0 = new MyThread();// Thread-0
//		t1.run();
		t0.setName("t0");//5
		t0.start();

		MyThread t1 = new MyThread();// Thread-1
		t1.setName("t1");
		t1.setPriority(Thread.MIN_PRIORITY);//1
		t1.start();

//		PRIORITY 1 - 10
		Thread t2 = new Thread(new Task());
		t2.setName("t2");
		t2.setPriority(Thread.MAX_PRIORITY);//10
		t2.start();
	

		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(i + "" + Thread.currentThread());
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		t3.setName("t3");
		t3.start();

		System.out.println("END");

	}

}
