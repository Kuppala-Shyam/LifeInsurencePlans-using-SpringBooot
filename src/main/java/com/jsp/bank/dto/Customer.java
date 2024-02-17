package com.jsp.bank.dto;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.transaction.TransactionScoped;
import lombok.Data;
@Entity
@Data
@Table(name = "Custm")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    private String name;
    private String mobile;
    private String gender;
    private boolean smoking;
    private boolean previousDiseases;
    private int age;
    private int premium;
    private int planId;
    //@Transient
//    @OneToOne
//    @JoinColumn(name = "planId")
//    private LifeInsurancePlan plan;
//		@Override
//		public String toString() {
//			return "Customer [id=" + id + ", name=" + name + ", mobile=" + mobile + ", gender=" + gender + ", smoking="
//					+ smoking + ", previousDiseases=" + previousDiseases + ", age=" + age + ", premium=" + premium
//					+ ", plan=" + plan + "]";
//		}
//		public Customer() {
//			super();
//			// TODO Auto-generated constructor stub
//		}
//		public Customer(String name, String mobile, String gender, String smoking, String previousDiseases, int age,
//				LifeInsurancePlan plan) {
//			super();
//			this.name = name;
//			this.mobile = mobile;
//			this.gender = gender;
//			this.smoking = true;
//			this.previousDiseases = true;
//			this.age = age;
//			this.plan = plan;
//		}
//		public boolean isSmoking() {
//			// TODO Auto-generated method stub
//			return false;
//		}
//		public boolean isPreviousDiseases() {
//			// TODO Auto-generated method stub
//			return false;
//		}
	
}


