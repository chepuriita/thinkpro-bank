package com.thinkpro.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkpro.bank.domain.ThinkProBank;
import com.thinkpro.bank.service.ThinkProBankService;

@RestController
@RequestMapping("/")
public class ThinkProBankController {
	
	@Autowired
	private ThinkProBankService thinkProBankService;
	
	@GetMapping(path = "get/{bankid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ThinkProBank> getThinkProBank(@PathVariable("bankid") int bankId) {
		System.out.println("bankId ----->:"+bankId);
		ThinkProBank thinkProBank = thinkProBankService.getById(bankId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Responded", "ThinkProBankController");
		return ResponseEntity.accepted().headers(headers).body(thinkProBank);
	}
	
	
	@PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getThinkProBank(@RequestBody ThinkProBank thinkProBank) {
		System.out.println("bankId ----->:"+thinkProBank.getBankId());				
		thinkProBankService.create(thinkProBank);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateThinkProBank(@RequestBody ThinkProBank thinkProBank) {
		System.out.println("bankId ----->:"+thinkProBank.getBankId());				
		thinkProBankService.update(thinkProBank);		
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
	@DeleteMapping(value = "remove/{bankid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> removeThinkProBank(@PathVariable("bankid") int bankId) {
		System.out.println("bankId ----->:"+bankId);				
		thinkProBankService.deleteById(bankId);		
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}

}
