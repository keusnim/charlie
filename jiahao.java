package charlie;

import java.util.*;

public class jiahao {

	public static void main(String[] args) {
		
		char[] gift={'a','b','c','d'};
		for(int i=0;i<4;i++) {
			System.out.print("���������֣�");
			Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			
			if(a>0&&a<=10) {
				if(gift[0]!='0') {
				System.out.println("��ϲ�鵽a����");
				gift[0]='0';
				continue;
				}
				else {
					System.out.println("��Ǹ�������ѱ�����");
					i--;
					continue;
				}
			}
			else if(a>10&&a<=20) {
				if(gift[1]!='0') {
				System.out.println("��ϲ�鵽b����");
				gift[1]='0';
				continue;
				}
				else {
					System.out.println("��Ǹ�������ѱ�����");
					i--;
					continue;
				}
			}
			else if(a>20&&a<=30) {
				if(gift[2]!='0') {
				System.out.println("��ϲ�鵽c����");
				continue;
				}
				else {
					System.out.println("��Ǹ�������ѱ�����");
					i--;
					continue;
				}
			}
			else {
				if(gift[3]!='0') {
				System.out.println("��ϲ�鵽d����");
				continue;
				}
				else {
					System.out.println("��Ǹ�������ѱ�����");
					i--;
					continue;
				}
			}
		}
		
		
		
  	}

}
