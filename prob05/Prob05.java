package com.zy.prob05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Prob05 {
	public static void main(String[] args) {

		ArrayList<Student> stuList = new ArrayList<Student>();

		ArrayList<Float> scoreList1 = new ArrayList<Float>();
		scoreList1.add(1.0f);
		scoreList1.add(1.0f);
		scoreList1.add(1.0f);
		scoreList1.add(1.0f);
		scoreList1.add(1.0f);
		scoreList1.add(1.0f);
		stuList.add(new Student("zs1", 18, "ÄÐ", scoreList1));

		ArrayList<Float> scoreList2 = new ArrayList<Float>();
		scoreList2.add(1.0f);
		scoreList2.add(2.0f);
		scoreList2.add(1.0f);
		scoreList2.add(1.0f);
		scoreList2.add(1.0f);
		scoreList2.add(1.0f);
		stuList.add(new Student("zs1", 18, "ÄÐ", scoreList2));

		ClassRoom cr = new ClassRoom("Èí¼þ16¼¶", stuList);

		Collections.sort(cr.getStuList());
		Iterator<Student> iter = cr.getStuList().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
