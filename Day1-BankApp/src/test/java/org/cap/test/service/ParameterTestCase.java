package org.cap.test.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTestCase {
	
	private int in1;
	private int in2;
	private int exp1;
	private int exp2;
	AcccountService accountService;
	
	public  ParameterTestCase(int in1, int exp1){
		this.in1= in1;
		this.exp1 = exp1;
		accountService = new AccountServiceImpl();
				
	}
	
	@Parameters
	public static List<Object[]> param(){
		List<Object[]> val =  Arrays.asList(new Object[][]{
			{2,4},
			{4,8},
			
	});
		
		return val;
		
	}

	@Test
	public void test() {
		assertEquals(exp1,accountService.addNumbers(in1,in1));
	}

}
