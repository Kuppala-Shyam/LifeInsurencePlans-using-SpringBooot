package com.jsp.bank.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.bank.dao.BankDao;
import com.jsp.bank.dto.Customer;
import com.jsp.bank.dto.LifeInsurancePlan;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	 List<Customer> findAll();
//	 List<Customer> findId(int id);
	   Customer findById(int id);

//public	BankDao saveCustomer(Customer c);
	   

}
