package com.jsp.bank.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name = "Insurance")
@AllArgsConstructor
@NoArgsConstructor
public class LifeInsurancePlan {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int planId;
	 private String bank;
	 private int tenure;
	 private int amount;
	 private int premium;
//	  @OneToOne(mappedBy="plan")
//	 private Customer customer;
	 private  int ageLimitMin;
	 private  int ageLimitMax;
	 public LifeInsurancePlan(String bank, int tenure, int amount, int ageLimitMin, int ageLimitMax) {
			super();
			this.bank = bank;
			this.tenure = tenure;
			this.amount = amount;
			this.ageLimitMin = ageLimitMin;
			this.ageLimitMax = ageLimitMax;
		}   
	    @Override
	    public String toString() {
	        return "Plan ID: " + planId + ", Bank: " + bank + ", Tenure: " + tenure + " years, Amount: ₹" + amount + ", Age Limit: " +
	                ageLimitMin + "-" + ageLimitMax;
	    }

	}

