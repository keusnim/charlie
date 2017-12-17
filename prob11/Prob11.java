package com.zy.prob11;

import java.util.Scanner;

public class Prob11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		try {
			System.out.println(SquareRoot.sqrt(num));
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}

	}

}
