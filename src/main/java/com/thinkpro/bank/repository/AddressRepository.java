package com.thinkpro.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thinkpro.bank.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
