package com.wfpan.classesdemo;

public class StringBufferDemo {
	//���� = �������һ��String
	public static void main(String[] args) {
/*		String a = "1";
		for(int i = 2; i<10000;i++) {
			a += i; //12 123 1234 12345 123456
			//java �������ջ��� gc
		}
		//���棺a[100] = {123456789}������� 9 String sb
*/		//abcdef
		
		StringBuffer sb = new StringBuffer();
		for(int i = 2; i<100;i++) {
			sb.append(i); //12 123 1234 12345 123456
			//java �������ջ��� gc
		}
		System.out.println(sb.toString());
		
		StringBuilder sb2 = new StringBuilder();
		
		//Stringbuffer synchronized:�̰߳�ȫ���ٶ���
		//Stringbuilder �̲߳���ȫ���ٶȿ�
		
		

		
	}
}
