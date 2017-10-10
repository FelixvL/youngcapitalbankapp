package nl.youngcapital.bankapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.youngcapital.bankapp.domain.Bank;
import nl.youngcapital.bankapp.service.BankService;

@RestController
public class BankEndpoint {
	@Autowired
	BankService bankService;
	
	@GetMapping("/bank")
	public String getBank() {
		return "Hallo";
	}
	@GetMapping("/bank2")
	public Bank getBankTwee() {
		Bank bank = new Bank("ABN-AMRO");
		bankService.test(bank);
		return bank;
	}
	@PostMapping("/bankpost")
	public void postEntiteit(@RequestBody Bank bank) {
		System.out.println("Jojo");
		System.out.println(bank.getNaam());
		bankService.test(bank);
	}
	
}
