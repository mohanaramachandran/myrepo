package org.cap.test.service;

import static org.junit.Assert.*;

import org.cap.dao.AccountDao;
import org.cap.dao.AccountDaoImpl;
import org.cap.dto.Account;
import org.cap.exception.InsufficientBalanceException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.cap.util.AccountUtil;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestDependency {
	@Mock
	public AccountDao accountDao;
	public AcccountService accountService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		
		
		accountDao =new AccountDaoImpl();
		accountService = new AccountServiceImpl();
		
	}
	@Ignore
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Account account = new Account();
		account.setAccountNo(AccountUtil.generateAccountNumber());
		
		Mockito.when(accountDao.findAccountById(1001)).thenReturn(account);
		
		Mockito.verify(accountDao).findAccountById(1001);
		
	}
	
	@Test
	public void test_withdrawalMethod() throws InsufficientBalanceException{
		Account account = new Account();
		account.setAccountNo(AccountUtil.generateAccountNumber());
		account.setAmount(1000);
		
		Mockito.when(accountDao.findAccountById(1001)).thenReturn(account);
		
		Account acc = accountService.withdraw(1001, 100.00);
		
		Mockito.verify(accountDao).findAccountById(1001);
		
		assertEquals(900, acc.getAmount());
	}

}
