package nl.youngcapital.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.youngcapital.bankapp.domain.Bank;

@Service
@Transactional
public class BankService {
	@Autowired
	BankRepository bankrepository;
	
	public Bank test(Bank bank) {
		bankrepository.save(bank);
		return bank;
	}
	
}
