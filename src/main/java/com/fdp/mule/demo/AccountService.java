package com.fdp.mule.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myAccountService")
public class AccountService {
	
	private final AccountRepository accountRepository;
	
	@Autowired
	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		
	}
	
	public List<Account> retrieveAllAccounts() {
		return accountRepository.findAll();
	}
	
	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}
	
	

}
