package com.zy.prob04;

import java.util.ArrayList;

public class Student {
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", scoreList=" + scoreList + "]";
	}
	
	

}
