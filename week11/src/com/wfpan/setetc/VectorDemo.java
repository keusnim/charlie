package com.wfpan.setetc;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//vector 自动增长的数组
		Vector vec = new Vector();
		vec.add(13);
		vec.addElement("14");
		vec.add(2, new Student("刘涛", 13, "女"));
		
		Object obj1 = vec.get(0);
		Object obj2 = vec.get(1);
		Object obj3 = vec.get(2);
		if(obj3 instanceof Student) {
			Student stu3 = (Student)obj3;
			stu3.getAge();
		}
		
		Vector<Integer> vec2 = new Vector<Integer>();
		vec2.add(13);
		vec2.addElement(14);
		Integer int3 = vec2.get(0);
		
		Vector<Student> vec3 = new Vector<Student>();
		vec3.add(new Student());
		vec3.get(0);
		
		Student stu = null;
		for(int i = 0; i< vec3.size(); i++) {
			stu = vec3.get(i);
		}
		
		class Cnt {
			String str = null;
			int cnt = 0;
			public Cnt(String s, int t) {
				this.str = s;
				this.cnt = t;
			}
			

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((str == null) ? 0 : str.hashCode());
				return result;
			}


			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Cnt other = (Cnt) obj;
				if (str == null) {
					if (other.str != null)
						return false;
				} else if (!str.equals(other.str))
					return false;
				return true;
			}


			@Override
			public String toString() {
				return "Cnt [str=" + str + ", cnt=" + cnt + "]";
			}
			
		}
		
		Vector<Cnt> vCnt = new Vector<Cnt>();
		
		String  a ="aa";
		String b = "aaaaaaabbaa";
		String tmp = null;
		
		for(int i=0; i< b.length()-a.length()+1; i++) {
			tmp = b.substring(i, i+a.length());
			if(vCnt.contains(new Cnt(tmp,0))) {
				int t = vCnt.indexOf(new Cnt(tmp,0));
				Cnt cc = vCnt.get(t);
				cc.cnt++;
			} else {
				vCnt.add(new Cnt(tmp,1));
			}
		}
		System.out.println(vCnt.toString());
		
		
		
		
		
	}

}
