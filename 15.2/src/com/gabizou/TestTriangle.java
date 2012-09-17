package com.gabizou;

import java.util.*;

public class TestTriangle {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hi. Please enter three numbers:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();
		System.out.println("Ok. Now processing the information");
		GeometricObject geoObject1 = new Triangle( a, b, c, "BLUE", true);
		
		System.out.println("Is the Triangle is filled? "+ geoObject1.isFilled());
		System.out.println("The color of the Triangle is "+ geoObject1.getColor());
		System.out.println("The area is "+ geoObject1.getArea());
		System.out.println("The perimeter is "+ geoObject1.getPerimeter());
		

	}

}
