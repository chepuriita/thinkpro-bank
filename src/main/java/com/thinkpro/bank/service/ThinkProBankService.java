package com.thinkpro.bank.service;

import com.thinkpro.bank.domain.ThinkProBank;

public interface ThinkProBankService {
	public ThinkProBank create(ThinkProBank thinkProBank);
	public String update(ThinkProBank thinkProBank);
	public ThinkProBank getById(int bankId);
	public Integer deleteById(int bankId);
}
