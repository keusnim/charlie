package com.zy.prob03;

import java.util.Scanner;

public class Prob03 {
	
	public static int getValue(int tmp) {
		if(1==tmp) {
			return 1;
		} else {
			return getValue(tmp-1)*tmp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += getValue(i);
		}
		
	}

}
