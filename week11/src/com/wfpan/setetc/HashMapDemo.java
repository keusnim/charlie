package com.wfpan.setetc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		String str = "11122233456567";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i< str.length(); i++) {
			char tmp = str.charAt(i);
			
			if(hm.containsKey(tmp)) {
				int cnt = hm.get(tmp);
				cnt++;
				hm.put(tmp, cnt);
			} else {
				hm.put(tmp, 1);
			}
		}
		Set<Character> ks = hm.keySet();
		Iterator<Character> iter = ks.iterator();
		while(iter.hasNext()) {
			Character tmp = iter.next();
			System.out.println(tmp+"=" + hm.get(tmp));
		}
		
		
	}

}
