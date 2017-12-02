package www.wfpan.stusort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		final int STUNUM = 3;
		ArrayList<Student> stuList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("ex: xx 12 nv");
		
		Student stu = null;
		while(i<STUNUM) {
			stu = new Student();
			System.out.println(i+1+":");
			String stuInfo = sc.nextLine();
			String[] infoArr = stuInfo.split(" ");
			stu.setName(infoArr[0]);
			stu.setAge(Integer.parseInt(infoArr[1]));
			stu.setSex(infoArr[2]);
			stuList.add(stu);
			i++;
		}
		sc.close();
		
		ClassDemo cls = new ClassDemo("Èí¼þ16¼¶", stuList);
		
		Student[] stuTmp = new Student[stuList.size()];
		for(i = 0; i < stuList.size();i++){
			stuTmp[i] = stuList.get(i);
		}
		
		System.out.println(Arrays.toString(stuTmp));
		
		Arrays.sort(stuTmp,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		System.out.println(Arrays.toString(stuTmp));
		
		System.out.println(cls);

	}

}
