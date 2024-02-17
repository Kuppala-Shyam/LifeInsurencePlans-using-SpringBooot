package com.jsp.bank.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jsp.bank.dao.BankDao;
import com.jsp.bank.dto.Customer;
import com.jsp.bank.dto.LifeInsurancePlan;
import com.jsp.bank.repo.CustomerRepo;
@RestController
@Controller
public class CustomerController {
	 @Autowired  
	 private BankDao dao;
	 @Autowired
	private CustomerRepo customerRepo;
	 
//	@PostMapping("/save")  
//	 public Customer save(@RequestBody Customer c) throws Exception {
//		return dao.saveCustomer(c);	 
//	 }
	@GetMapping("/update")
    public <T> ResponseEntity<T> saveCustomer(@RequestBody Customer customer) throws Exception {
        return (ResponseEntity<T>) dao.saveCust(customer);
    }
//	 @PostMapping("/plan")
//	 public LifeInsurancePlan plan(@RequestBody LifeInsurancePlan plan) throws Exception {
//			return dao.;			 
//		 }
	@GetMapping("/retrievePlanForCustomer/{id}")
	public LifeInsurancePlan retrievePlanForCustoemr(@PathVariable(name="id") int id) throws Exception {
		return dao.fetchPlanByCustomerId(id);
	}
//	@GetMapping("/plans")
//	public LifeInsurancePlan retrievePlans() {
//		return null;
//	}
	@GetMapping("/allcustomers")
	public  List<Customer> getAllCustomers() {
        return dao.getAllCustomers();
    }
//	@GetMapping("/customersdetails")
//	public List<Customer> getByIdCustomers(int id){
//		return dao.getByIdCustomers(id);
//	}
	
}
