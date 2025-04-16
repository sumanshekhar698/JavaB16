package com.java.advanced.mutithreading;

public class SynchronizationProblem {
	public static void main(String[] args) {
		PrimeMinister pm1 = PrimeMinister.electMyPM("Mr Modi", 50);
		System.out.println(pm1);
		System.out.println(pm1.hashCode());

		PrimeMinister pm2 = PrimeMinister.electMyPM("Mr Rahul", 40);
		System.out.println(pm2);
		System.out.println(pm2.hashCode());

	}
}
