package com.thinkpro.bank.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "thinkprobank")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ThinkProBank implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 933810086970109299L;

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int bankId;
		
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String description;
	
	
	/*@OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
	 @JoinColumn(referencedColumnName = "address_id")
	@JsonManagedReference
	private List<Address> address;*/
	
	
	@OneToMany(mappedBy="thinkProBank", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)	
    @JsonManagedReference
    private Set<Address> address;
			
	public ThinkProBank() {
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}


	public int getBankId() {
		return bankId;
	}


	public void setBankId(int bankId) {
		this.bankId = bankId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	

}
