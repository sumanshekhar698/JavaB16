package com.java.exception_handling;

import java.util.Scanner;

import com.java.oops.InvalidVotingAge;

public class CustomExceptions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

		try {
			votingEligblityCheck(age);
		} catch (InvalidVotingAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void votingEligblityCheck(int age) throws InvalidVotingAge {

		if (age < 0 || age > 200) {
			throw new InvalidVotingAge("Invalid Age");
		} else if (age < 18) {
			throw new InvalidVotingAge("Under Age");
		}

	}

}


