package com.gabizou;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		GeometricObject tester = new Triangle(3, 4, 5, "white", true);
		Assert.assertEquals(true, tester.isFilled());
		Assert.assertEquals("The color doesn't match!", "white", tester.getColor());
		Assert.assertEquals("The height isn't working!", 4.0, 4.0, 0.01);
		Assert.assertEquals("The area ins't being calculated right!", 6.0, tester.getArea(), 0.01);
		Assert.assertEquals("The perimeter isn't being calculated right!", 12.0, tester.getPerimeter(), 0.01);
	}

}
