package com.wfpan.classesdemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*while (0 != sc.nextInt()) {
			System.out.println(sc.nextInt());
			System.out.println(sc.nextFloat());
			System.out.println(sc.nextDouble());
			System.out.println(sc.nextBoolean());
			System.out.println(sc.nextShort());
		}
*/
		System.out.println("Please input:");
		int i = 0;
		Student stu = null;
		String stuInfo = null;
		String[] info = null;
		while(i < 100) {
			stuInfo = sc.nextLine();
			info = stuInfo.split(" ");
			stu = new Student(info[0],Integer.parseInt(info[1]),info[2]);
		}
	}
}
