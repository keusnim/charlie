package com.zy.prob05;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private String sex;
	private ArrayList<Float> scoreList;
	public Student(String name, int age, String sex, ArrayList<Float> scoreList) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.scoreList = scoreList;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public ArrayList<Float> getScoreList() {
		return scoreList;
	}
	public void setScoreList(ArrayList<Float> scoreList) {
		this.scoreList = scoreList;
	}
	
	public float getTotalScore() {
		float totalScore = 0.0f;
		for (int i = 0; i < scoreList.size(); i++) {
			totalScore += scoreList.get(i);
			
		}
		return totalScore;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", scoreList=" + scoreList + "]";
	}
	@Override
	public int compareTo(Student o) {
		//从小到大1:0:-1
		//da -> xiao : -1:0:1
//		return this.getTotalScore()-o.getTotalScore()>0?1:(this.getTotalScore()-o.getTotalScore()==0?0:-1);
		return this.getTotalScore()-o.getTotalScore()>0?-1:(this.getTotalScore()-o.getTotalScore()==0?0:1);
	}
	
	

}
