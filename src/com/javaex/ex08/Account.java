package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {}
    
    public Account(String ac) {
    	this.accountNo = ac; 
    }
    
    //필요한 메소드 작성
    
    public void deposit(int deposit) {
    	this.balance += deposit;
    }
	public void withdraw(int withdraw) {
	    	this.balance -= withdraw;
	    }
	public void showBalance() {
		System.out.println(balance);
	}
}
