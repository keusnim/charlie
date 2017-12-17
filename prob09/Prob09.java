package com.zy.prob09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Prob09 {
	public static void main(String[] args) {
		HashMap<String, Integer> cntMap = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		//Hello!Hello!I am 01.What is your name?
		String[] words = word.split("[^a-zA-Z]+");
		
		for (String s : words) {
			if(cntMap.containsKey(s)) {
				int nv  = cntMap.get(s)+1;
				cntMap.put(s, nv);
			} else {
				cntMap.put(s, 1);
			}
		}
		
		Iterator<String> iter = cntMap.keySet().iterator();
		while(iter.hasNext()) {
			String k  = iter.next();
			System.out.println(k+":"+cntMap.get(k));
		}
		
		System.out.println(Arrays.toString(words));
		
	}

}
