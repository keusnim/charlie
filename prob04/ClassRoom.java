package com.zy.prob04;

import java.util.ArrayList;

public class ClassRoom {
	private String name;
	private ArrayList<Student> stuList;
	public ClassRoom() {
		super();
	}
	public ClassRoom(String name, ArrayList<Student> stuList) {
		super();
		this.name = name;
		this.stuList = stuList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Student> getStuList() {
		return stuList;
	}
	public void setStuList(ArrayList<Student> stuList) {
		this.stuList = stuList;
	}
	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", stuList=" + stuList + "]";
	}
	

}
