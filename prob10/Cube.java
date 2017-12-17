package com.zy.prob10;

public class Cube implements Comparable<Cube>{
	private float length;
	private float width;
	private float height;
	private float volumn;
	
	public Cube() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cube(float length, float width, float height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.volumn = length * width * height;
	}


	public Cube(float length, float width, float height, float volumn) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.volumn = volumn;
	}


	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getVolumn() {
		return volumn;
	}

	public void setVolumn(float volumn) {
		this.volumn = volumn;
	}

	@Override
	public String toString() {
		return "Cube [length=" + length + ", width=" + width + ", height=" + height + ", volumn=" + volumn + "]";
	}


	@Override
	public int compareTo(Cube o) {
		// TODO Auto-generated method stub
		boolean flag = this.volumn-o.volumn < 10e-6;
		return flag?0:(this.volumn-o.volumn>0?1:-1);
	}
	
	
	

}
