package com.thinkpro.bank.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thinkpro.bank.domain.ThinkProBank;

@Repository
public interface ThinkProBankRepository extends JpaRepository<ThinkProBank, Integer> {
	

}
