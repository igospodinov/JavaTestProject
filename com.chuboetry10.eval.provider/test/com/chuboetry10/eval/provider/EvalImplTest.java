package com.chuboetry10.eval.provider;

import org.junit.Test;

import junit.framework.TestCase;

public class EvalImplTest extends TestCase {
	
	@Test
	public void evaluateTest() {

		String result = new EvalImpl().calculate("ivan");
		assertEquals("IVAN", result);
	}
}