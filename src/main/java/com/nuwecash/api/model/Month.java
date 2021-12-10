package com.nuwecash.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="month")
public class Month {
	

	@Id
	@Column(name="nameuuid",nullable = false, length = 30)
	private String nameUUID;
	
	@Column(name="name",nullable = false, length = 30)
	private String name;
	

	
	@Column(name="totalusers",nullable = false)
	private int totalUsers;
	
	@Column(name="totalnewusers",nullable = false)
	private int totalNewUsers;
	
	@Column(name="totaluniqueusers",nullable = false)
	private int totalUniqueUsers;
	
	@Column(name="requestedmoney",nullable = false)
	private double requestedMoney;
	
	@Column(name="aceptedrequestpaid",nullable = false, length = 30)
	private String aceptedRequestPaid;
	
	@Column(name="acceptedrequestunpaid",nullable = false, length = 30)
	private String acceptedRequestunpaid;
	
	@Column(name="loanreturntime",nullable = false, length = 30)
	private String loanReturnTime;
	
	@Column(name="realbudget",nullable = false)
	private double realBudget;
	
	@Column(name="predictedbudget",nullable = false)
	private double predictedBudget;

	public Month() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameUUD() {
		return nameUUID;
	}

	public void setNameUUD(String nameUUD) {
		this.nameUUID = nameUUD;
	}

	public int getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}

	public int getTotalNewUsers() {
		return totalNewUsers;
	}

	public void setTotalNewUsers(int totalNewUsers) {
		this.totalNewUsers = totalNewUsers;
	}

	public int getTotalUniqueUsers() {
		return totalUniqueUsers;
	}

	public void setTotalUniqueUsers(int totalUniqueUsers) {
		this.totalUniqueUsers = totalUniqueUsers;
	}

	public double getRequestedMoney() {
		return requestedMoney;
	}

	public void setRequestedMoney(double requestedMoney) {
		this.requestedMoney = requestedMoney;
	}

	public String getAceptedRequestPaid() {
		return aceptedRequestPaid;
	}

	public void setAceptedRequestPaid(String aceptedRequestPaid) {
		this.aceptedRequestPaid = aceptedRequestPaid;
	}

	public String getAcceptedRequestunpaid() {
		return acceptedRequestunpaid;
	}

	public void setAcceptedRequestunpaid(String acceptedRequestunpaid) {
		this.acceptedRequestunpaid = acceptedRequestunpaid;
	}

	public String getLoanReturnTime() {
		return loanReturnTime;
	}

	public void setLoanReturnTime(String loanReturnTime) {
		this.loanReturnTime = loanReturnTime;
	}

	public double getRealBudget() {
		return realBudget;
	}

	public void setRealBudget(double realBudget) {
		this.realBudget = realBudget;
	}

	public double getPredictedBudget() {
		return predictedBudget;
	}

	public void setPredictedBudget(double predictedBudget) {
		this.predictedBudget = predictedBudget;
	}
	
	
}
