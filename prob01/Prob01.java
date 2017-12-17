package com.zy.prob01;

import java.util.Scanner;

public class Prob01 {
	
	public static void getSum(String num) {
		/*char[] arr = num.toCharArray();
		int sum = 0;
		for (char c : arr) {
			sum += c-'0';
			//Integer.parseInt(new String(new char[]{c}));
		}
		System.out.println(sum);*/
		
		/*int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += Integer.parseInt(num.substring(i, i+1));
		}
		System.out.println(sum);*/
		
	}
	
	public static void main(String[] args) {
		String num  = null;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextLine();
		//"123456"
		getSum(num);
	}

}
