package com.zy.prob11;

public class SquareRoot {
	public static double sqrt(double num) throws NegativeNumberException {
		if(num<0) {
			throw new NegativeNumberException("�������ܿ�����");
		} else {
			return Math.sqrt(num);
		}
	}

}
