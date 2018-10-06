package com.thinkpro.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.cj.ParseInfo;
import com.thinkpro.bank.domain.ThinkProBank;
import com.thinkpro.bank.repository.AddressRepository;
import com.thinkpro.bank.repository.ThinkProBankRepository;

@Service
@Transactional
public class ThinkProBankServiceImpl implements ThinkProBankService{
	
	@Autowired
	private ThinkProBankRepository thinkProBankRepository;
	

	@Override
	public ThinkProBank create(ThinkProBank thinkProBank) {		
		thinkProBankRepository.save(thinkProBank);		
		return thinkProBank;
	}

	@Override
	public String update(ThinkProBank thinkProBank) {
		thinkProBankRepository.save(thinkProBank);
		return thinkProBank.getName();
	}

	@Override
	public ThinkProBank getById(int bankId) {
		System.out.println("Id from service ----->:"+bankId);		
		ThinkProBank thinkProBank = thinkProBankRepository.getOne(bankId);
		System.out.println("Name from service ----->:"+thinkProBank.getName());
		return thinkProBank;		
	}

	@Override
	public Integer deleteById(int bankId) {
		thinkProBankRepository.deleteById(bankId);
		return new Integer(bankId);
	}

}
