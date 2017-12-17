package com.zy.prob07;

import java.util.Scanner;

public class Prob07 {
	public static int getCnt(String str1, String str2) {
		int cnt = 0;
		if(str1.length()<str2.length()) {
			//123
			//123 456789
			String tmp = null;
			for (int i = 0; i < str2.length()-str1.length()+1; i++) {
				tmp = str2.substring(i,i+str1.length());
				if(tmp.equals(str1)) {
					++cnt;
				}
				
			}
			
		} else {
			 getCnt(str2, str1);
			
		}
		return cnt;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int cnt = getCnt(str1,str2);
		System.out.println(cnt);
		
	}

}
