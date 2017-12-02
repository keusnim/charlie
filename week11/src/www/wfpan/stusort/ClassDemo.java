package www.wfpan.stusort;

import java.util.ArrayList;

//ctrl+shift+O
public class ClassDemo {
	private String clsName;
	private ArrayList<Student> stuList;
	
	
	public ClassDemo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ClassDemo(String clsName, ArrayList<Student> stuList) {
		super();
		this.clsName = clsName;
		this.stuList = stuList;
	}


	public String getClsName() {
		return clsName;
	}


	public void setClsName(String clsName) {
		this.clsName = clsName;
	}


	public ArrayList<Student> getStuList() {
		return stuList;
	}


	public void setStuList(ArrayList<Student> stuList) {
		this.stuList = stuList;
	}


	@Override
	public String toString() {
		return "ClassDemo [clsName=" + clsName + ", stuList=" + stuList + "]";
	}
	
	
	
	
	
}
