package charlie;

import java.util.*;

public class jiahao {

	public static void main(String[] args) {
		
		char[] gift={'a','b','c','d'};
		for(int i=0;i<4;i++) {
			System.out.print("请输入数字：");
			Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			
			if(a>0&&a<=10) {
				if(gift[0]!='0') {
				System.out.println("恭喜抽到a礼物");
				gift[0]='0';
				continue;
				}
				else {
					System.out.println("抱歉，礼物已被抽走");
					i--;
					continue;
				}
			}
			else if(a>10&&a<=20) {
				if(gift[1]!='0') {
				System.out.println("恭喜抽到b礼物");
				gift[1]='0';
				continue;
				}
				else {
					System.out.println("抱歉，礼物已被抽走");
					i--;
					continue;
				}
			}
			else if(a>20&&a<=30) {
				if(gift[2]!='0') {
				System.out.println("恭喜抽到c礼物");
				continue;
				}
				else {
					System.out.println("抱歉，礼物已被抽走");
					i--;
					continue;
				}
			}
			else {
				if(gift[3]!='0') {
				System.out.println("恭喜抽到d礼物");
				continue;
				}
				else {
					System.out.println("抱歉，礼物已被抽走");
					i--;
					continue;
				}
			}
		}
		
		
		
  	}

}
