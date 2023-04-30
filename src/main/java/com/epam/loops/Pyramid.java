package com.epam.loops;

import java.util.Arrays;

public class Pyramid {

	public void printPyramid(int cathetusLength) {
		int rCount = 1;
		int lCount = 2;

		for (int i = 1; i <= cathetusLength; i++) {

			for (int a = i; a < cathetusLength; a++) {

				System.out.print(" ");
			}

			for (int b = i; b >= 1; b--) {
				System.out.print(rCount);
				rCount--;
			}
			rCount = i + 1;

			for (int c = i - 1; c > 0; c--) {
					if(i > 1) {
						System.out.print(lCount++);
					}
				//lCount++;

			}
			lCount = 2;
			System.out.println();

		}

	}

	public static void main(String[] args) {
		new Pyramid().printPyramid(7);
	}

}
