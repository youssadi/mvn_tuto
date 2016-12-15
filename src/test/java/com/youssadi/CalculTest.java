package com.youssadi;

import junit.framework.TestCase;

public class CalculTest extends TestCase {
    private Calcul cl;
	protected void setUp() throws Exception {
		super.setUp();
		cl = new Calcul();
	}
	
	public void testAdd(){
		assertTrue(3==cl.add(2, 1));
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
