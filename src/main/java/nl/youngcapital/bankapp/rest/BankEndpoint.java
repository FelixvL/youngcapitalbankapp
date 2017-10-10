package nl.youngcapital.bankapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankEndpoint {
	@GetMapping("/bank")
	public String getBank() {
		return "Hallo";
	}
	
	
}
