package org.cap.test.service;

import static org.junit.Assert.*;

import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AccountServiceTest {

	private AcccountService accountService;
	
	public AccountServiceTest(){
//		accountService = new AccountServiceImpl();
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	@Category (GoodTestCategory.class)
	public void testAddNumbers(){
		assertEquals(2,accountService.addNumbers(1, 1));
		
	}
	
	@Category (BadTestCategory.class)
	@Test(expected=IllegalArgumentException.class)
	public void testaddAccount_null_customer_excep() throws IllegalArgumentException, InvalidInitialAmountException{
		Customer customer = null;
		double amount = 10;
		accountService.addAccount(customer, amount);		
		
	}
	
	@Test(expected=InvalidInitialAmountException.class)
	public void testaddAccount_amout_customer_excep() throws InvalidInitialAmountException{
		Customer customer = new Customer();
		double amount = 10;
		accountService.addAccount(customer, amount);		
		
	}
	
	@Test(timeout=500)
	public void testTime(){
		
	}
	
	@Before
	public void beforeMethod(){
		accountService = new AccountServiceImpl();
	}
	
	@BeforeClass
	public static void beforeMethodClass(){
		//accountService = new AccountServiceImpl();
	}


}
