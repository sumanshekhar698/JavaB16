package com.java.oops.arrays;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] matrix = new int[3][8];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

	}

}
