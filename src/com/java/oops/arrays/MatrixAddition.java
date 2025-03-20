package com.java.oops.arrays;

import java.util.Arrays;

public class MatrixAddition {//Matrix Multiplication

	public static void main(String[] args) {
		int mat1[][] = { { 3, 6, 9 }, { 5, 67, 1 } };

		int[][] mat2 = { { 243, 3456, 129 }, { 245, 34, 12 } };

		if (mat1.length == mat2.length && mat1[0].length == mat2[0].length) {

			int res[][] = new int[mat1.length][mat1[0].length];

			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[i].length; j++) {
					res[i][j] = mat1[i][j] + mat2[i][j];
				}
			}

			for (int i = 0; i < res.length; i++) {
				System.out.println(Arrays.toString(res[i]));
			}

		} else {
			System.out.println("Addition of matrices not possible");
		}
	}

}
