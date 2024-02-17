package com.jsp.bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.bank.dao.LifeInsurancePlanService;
import com.jsp.bank.dto.LifeInsurancePlan;

@RestController
public class InsurancePlanController {
	
	@Autowired
	public LifeInsurancePlanService insurancePlanService;
//	
//	@PostMapping("/save")
//	public LifeInsurancePlan savePlan(@RequestBody LifeInsurancePlan insurancePlan) {
//		return ((LifeInsurancePlanService) insurancePlanService).savePlan(insurancePlan);
//	}
	@GetMapping("/allplans")
	public List<LifeInsurancePlan> getAllPlans() {
        return insurancePlanService.getAllPlans();
    }
	

}
