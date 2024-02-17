package com.jsp.bank.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.bank.dto.LifeInsurancePlan;
@Repository
public interface LifeInsurancePlanRepo extends JpaRepository<LifeInsurancePlan, Integer>{
	 List<LifeInsurancePlan> findAll();
	 Optional<LifeInsurancePlan> findById(int planId);
}
