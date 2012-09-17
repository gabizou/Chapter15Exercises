package com.gabizou;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		GeometricObject tester = new Triangle(3.0, 4.0, 5.0, "white", true);
		assertEquals(true, tester.isFilled());
		assertEquals("The color doesn't match!", "white", tester.getColor());
		assertEquals("The height isn't working!", 4.0, 4.0, 0.01);
		assertEquals("The area ins't being calculated right!", 6.0, tester.getArea(), 0.01);		
		assertEquals("The perimeter isn't being calculated right!", 12.0, tester.getPerimeter(), 0.01);
	}

}
