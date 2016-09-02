package org.cap.test.service;

import static org.junit.Assert.*;

import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class RulesDemo {
	AcccountService accService;
	public RulesDemo(){
		 accService = new AccountServiceImpl();
		
	}	
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	@Rule
	public Timeout timeout=new Timeout(10);
	@Test
	public void test() throws InvalidInitialAmountException{
		//accService.findAccountById(1001);
		accService.addAccount(new Customer(), 100);
		thrown.expect(InvalidInitialAmountException.class);
	}

}
