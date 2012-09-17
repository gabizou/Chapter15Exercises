package com.gabizou;

public class Triangle extends GeometricObject {

	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(){

	}

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public Triangle(double sideA, double sideB, double sideC, String color, boolean filled) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		setColor(color);
		setFilled(filled);
	}

	/** Return base */
	public double getBase() {
		return sideA;

	}

	public void setBase(double base) {
		this.sideA = base;
	}


	public double getHeight() {
		double sa = sideA;
		double sb = sideB;
		double sc = sideC;
		double sp = (sideA + sideB + sideC)/2;
		double sd = 2/getBase();
		double product = Math.abs(sp *(sp - sa) * (sp - sb) * (sp - sc));
		double root = Math.sqrt(product);
		double height = sd* root;
		System.out.println("The height is "+ height);
		return height;
	}

	public double getArea() {
		return sideA * getHeight() * 0.5;
	}

	public double getPerimeter() {
		double perimeter = sideA + sideB + sideC;
		return perimeter;
	}

}
