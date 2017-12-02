package com.wfpan.classesdemo;

public class StringBufferDemo {
	//缓存 = 带数组的一个String
	public static void main(String[] args) {
/*		String a = "1";
		for(int i = 2; i<10000;i++) {
			a += i; //12 123 1234 12345 123456
			//java 垃圾回收机制 gc
		}
		//缓存：a[100] = {123456789}几点对象？ 9 String sb
*/		//abcdef
		
		StringBuffer sb = new StringBuffer();
		for(int i = 2; i<100;i++) {
			sb.append(i); //12 123 1234 12345 123456
			//java 垃圾回收机制 gc
		}
		System.out.println(sb.toString());
		
		StringBuilder sb2 = new StringBuilder();
		
		//Stringbuffer synchronized:线程安全、速度慢
		//Stringbuilder 线程不安全、速度快
		
		

		
	}
}
