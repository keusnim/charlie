package com.zy.prob10;

import java.util.ArrayList;
import java.util.Collections;

public class Prob10 {
	public static void main(String[] args) {
		ArrayList<Cube> cubeList = new ArrayList<Cube>();
		for (int i = 0; i < 10; i++) {
			cubeList.add(new Cube(1.0f,2.0f,3.0f));
		}
		
		Collections.sort(cubeList);
	}
}
