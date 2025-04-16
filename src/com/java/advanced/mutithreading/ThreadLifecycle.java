package com.java.advanced.mutithreading;

public class ThreadLifecycle {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("START");


		MyThread t1 = new MyThread();// Thread-1
		System.out.println("State t1: "+t1.getState());
		
		t1.setName("t1");
		t1.setPriority(Thread.MIN_PRIORITY);//1
		t1.start();
		System.out.println("State t1:: "+t1.getState());
		
		System.out.println("State main:: "+Thread.currentThread().getState());
		

		System.out.println("State t1:: "+t1.getState());

		t1.join();
		System.out.println("State main:: "+Thread.currentThread().getState());

		System.out.println("State t1:: "+t1.getState());

		System.out.println("END");
		System.out.println("State t1: "+t1.getState());


	}

}
