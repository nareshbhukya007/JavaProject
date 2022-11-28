package com.java.array;

import java.util.Scanner;

public class TwoDimentionArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaration of an 2d Array
		int[][] ar = new int[3][];
		ar[0] = new int[3];
		ar[1] = new int[4];
		ar[2] = new int[5];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("please enter the marks of the class " + i + " student " + j);
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("The marks of the students are");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}

}
