package com.wfpan.setetc;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		//���򡢲��ظ�
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		
		//û��get(i)/indexOf()ͨ������������
		Iterator<Integer> inteInter = hs.iterator();
		while(inteInter.hasNext()) {
			Integer tmp = inteInter.next();
			System.out.println(tmp);
		}
		
		System.out.println(hs.toString());
	}

}
