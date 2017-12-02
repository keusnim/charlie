package com.wfpan.setetc;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("1",1,"nv"));
		stuList.add(new Student("1",1,"nv"));
		stuList.add(new Student("1",1,"nv"));
		stuList.add(new Student("1",1,"nv"));
		
		/*for(int i=0; i< stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}*/
		
		//µü´úÆ÷£ºvector¡¢arraysllist
		/*Iterator<Student> stuIter = stuList.iterator();
		Student stu = null;
		while(stuIter.hasNext()) {
			stu = stuIter.next();
			System.out.println(";;;;" + stu);
		}*/
		
		
		
		
		
		
		
	}

}
