package com.jsp.bank.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.bank.dto.Customer;
import com.jsp.bank.dto.LifeInsurancePlan;
import com.jsp.bank.repo.LifeInsurancePlanRepo;

@Service
public class LifeInsurancePlanService {
	@Autowired
	private LifeInsurancePlanRepo insurancePlanRepo;
	
	public List<LifeInsurancePlan> getAllPlans() {
        return insurancePlanRepo.findAll();
    }
	public Optional<LifeInsurancePlan> getPlanById(int planId) {
        return insurancePlanRepo.findById(planId);
    }

//
//	public LifeInsurancePlan savePlan(LifeInsurancePlan insurancePlan) {
//		
//		return
//	}
	



	

}
