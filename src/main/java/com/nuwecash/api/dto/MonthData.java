package com.nuwecash.api.dto;

public class MonthData {
    private int acceptedRequests;
    private String loanReturnTime;
    private double budget;

    public MonthData(int acceptedRequests, String loanReturnTime, double budget) {
		super();
		this.acceptedRequests = acceptedRequests;
		this.loanReturnTime = loanReturnTime;
		this.budget = budget;
	}

	public int getAcceptedRequests() {
        return acceptedRequests;
    }

    public void setAcceptedRequests(int acceptedRequests) {
        this.acceptedRequests = acceptedRequests;
    }

    public String getLoanReturnTime() {
        return loanReturnTime;
    }

    public void setLoanReturnTime(String loanReturnTime) {
        this.loanReturnTime = loanReturnTime;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
