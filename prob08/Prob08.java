package com.zy.prob08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prob08 {
	public static void main(String[] args) {
		ArrayList<String> stuList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10;i++) {
			stuList.add(sc.nextLine());
		}
		
		Collections.sort(stuList);
	}

}
