package com.zy.prob04;

import java.util.ArrayList;

public class Prob04 {
	public static void main(String[] args) {
		
		Student[] stus = new Student[2];
		
		ArrayList<Float> scoreList1 = new ArrayList<Float>();
		scoreList1.add(1.0f);
		scoreList1.add(1.0f);
		scoreList1.add(1.0f);
		scoreList1.add(1.0f);
		scoreList1.add(1.0f);
		scoreList1.add(1.0f);
		stus[0]= new Student("zs1", 18, "ÄÐ", scoreList1);
		
		ArrayList<Float> scoreList2 = new ArrayList<Float>();
		scoreList2.add(1.0f);
		scoreList2.add(1.0f);
		scoreList2.add(1.0f);
		scoreList2.add(1.0f);
		scoreList2.add(1.0f);
		scoreList2.add(1.0f);
		stus[1]= new Student("zs1", 18, "ÄÐ", scoreList2);
		
		float sum = 0.0f;
		
		for (int i = 0; i < stus[0].getScoreList().size(); i++) {
			for (int j = 0; j < stus.length; j++) {
				sum += stus[i].getScoreList().get(j);
			}
		}
		
		
		
	}

}
