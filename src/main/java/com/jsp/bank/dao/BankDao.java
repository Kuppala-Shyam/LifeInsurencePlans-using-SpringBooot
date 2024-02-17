package com.jsp.bank.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.jsp.bank.dao.LifeInsurancePlanService;
import com.jsp.bank.dto.LifeInsurancePlan;
import com.jsp.bank.dto.Customer;
import com.jsp.bank.dto.LifeInsurancePlan;
import com.jsp.bank.repo.CustomerRepo;
import com.jsp.bank.repo.LifeInsurancePlanRepo;
@Service
public class BankDao {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private LifeInsurancePlanRepo lifeInsurancePlanRepo;
    private LifeInsurancePlan lifeInsurancePlan;
    public  <T> ResponseEntity<T> saveCust(Customer customer) throws Exception {   
  try {   	
            if (customer.getAge() < 18 || customer.getAge() > 60) {
//                throw new InvalidAgeException("Customer age not within plan limits.");
//                throw new BadRequestException("Customer must be 18 years or older.");
                return (ResponseEntity<T>) ResponseEntity.badRequest().body("Customer age not within plan limits");
            }
            int adjustedPremium=lifeInsurancePlan.getPremium();
            // Adjust premium based on smoking and previous diseases
            if (customer.isSmoking()) {
            	adjustedPremium+=150 ;
            }
            if (customer.isPreviousDiseases()) {
            	adjustedPremium+=200;
            }
            // Apply potential discount (if applicable)
            adjustedPremium=(int) (adjustedPremium*0.95);// Assuming a 5% discount
            // Set the final premium
            lifeInsurancePlan.setPremium(adjustedPremium);
            // Save the customer with updated premium
//            customerRepo.save(customer);
//            return (Customer) fetchById(customer.getId());
//            return customer;
            Customer savedCustomer = customerRepo.save(customer);
//            List<Customer> customerList=new ArrayList<>();
//            customerList.add(savedCustomer);
            
            return (ResponseEntity<T>) ResponseEntity.ok().body(savedCustomer);
 			} 
//  			catch (BadRequestException e) {
////      // Return only the exception message for this specific exception
////  				return ResponseEntity.badRequest().body(e.getMessage());
//  			} 
  		catch (Exception e) {
            e.printStackTrace();
            throw e; // Rethrow the exception to allow proper handling
        }
  
  } 
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
//    public List<Customer> getByIdCust(int id){
//    	return customerRepo.findId(id)  ;  
//    }
//    public Customer saveCustomer(Customer customer) throws Exception {
//        try {
//        	
//            if (customer.getAge() < 18 || customer.getAge() > 60) {
//                throw new InvalidAgeException("Customer age not within plan limits.");
//            }
//            int adjustedPremium=customer.getPremium();
//            // Adjust premium based on smoking and previous diseases
//            if (customer.isSmoking()) {
//            	adjustedPremium+=150 ;
//            }
//            if (customer.isPreviousDiseases()) {
//            	adjustedPremium+=200;
//            }
//
//            // Apply potential discount (if applicable)
//            adjustedPremium=(int) (adjustedPremium*0.95);// Assuming a 5% discount
//
//            // Set the final premium
//            customer.setPremium(adjustedPremium);
//
//            // Save the customer with updated premium
//            customerRepo.save(customer);
//            return (Customer) fetchById(customer.getId());
////            return customer;
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw e; // Rethrow the exception to allow proper handling
//        }
//    }
//    public  List<LifeInsurancePlan> fetchAll(){
//		  query= em.createQuery("select a from LifeInsurancePlan a");
//		return query.getResultList();
//	}
    public Customer fetchById(int id) {
      return customerRepo.findById(id);
    	
    }
    
    public  LifeInsurancePlan fetchPlanByCustomerId(int customerId) throws Exception {
//    	System.out.println("Customer "+customerId);
    	Customer customer=fetchById(customerId);

    Optional<LifeInsurancePlan> li=	lifeInsurancePlanRepo.findById(customer.getPlanId());
    if(li.isPresent()) {
    	return li.get();
    }
    else {
    	throw new Exception("No plan found for this customer");
    }
   }
    
    
}


