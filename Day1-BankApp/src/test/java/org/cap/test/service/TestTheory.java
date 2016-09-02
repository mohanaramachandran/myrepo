package org.cap.test.service;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TestTheory {
	
	@DataPoints
	public static int[] mydata(){
		return new int[]{0,1,2,3,-5};
	}

	@Theory
	public void testTheory(Integer x, Integer y) {
		//fail("Not yet implemented");
		
		Assume.assumeTrue(x>0 && y>0);
		Assume.assumeTrue((x+y)>0);
		
	}

}
