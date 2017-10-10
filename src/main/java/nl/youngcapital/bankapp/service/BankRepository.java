package nl.youngcapital.bankapp.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.youngcapital.bankapp.domain.Bank;

@Component
public interface BankRepository extends CrudRepository<Bank, Long> {

}
