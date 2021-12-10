package com.nuwecash.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="month")
public class Month {
	

	@Id
	@Column(name="nameuuid", length = 30)
	private String nameUUID;
	
	@Column(name="name", length = 30)
	private String name;
	

	
	@Column(name="totalusers")
	private int totalUsers;
	
	@Column(name="totalnewusers")
	private int totalNewUsers;
	
	@Column(name="totaluniqueusers")
	private int totalUniqueUsers;
	
	@Column(name="requestedmoney")
	private double requestedMoney;
	@Column(name="peruserrequestedmoney")
	private double perUserRequestedMoney;
	
	@Column(name="aceptedrequestpaid", length = 30)
	private int aceptedRequestPaid;
	
	@Column(name="acceptedrequestunpaid", length = 30)
	private int acceptedRequestunpaid;
	
	@Column(name="loanreturntime", length = 30)
	private String loanReturnTime;
	
	@Column(name="realbudget")
	private double realBudget;
	
	@Column(name="predictedbudget")
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

	public int getAceptedRequestPaid() {
		return aceptedRequestPaid;
	}

	public void setAceptedRequestPaid(int aceptedRequestPaid) {
		this.aceptedRequestPaid = aceptedRequestPaid;
	}

	public int getAcceptedRequestunpaid() {
		return acceptedRequestunpaid;
	}

	public void setAcceptedRequestunpaid(int acceptedRequestunpaid) {
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

	public String getNameUUID() {
		return nameUUID;
	}

	public void setNameUUID(String nameUUID) {
		this.nameUUID = nameUUID;
	}

	public double getPerUserRequestedMoney() {
		return perUserRequestedMoney;
	}

	public void setPerUserRequestedMoney(double perUserRequestedMoney) {
		this.perUserRequestedMoney = perUserRequestedMoney;
	}
}
