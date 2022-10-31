package com.ezen.ex01;

public class BankAccount {

	public static void main(String[] args) {

		BankAccount00 yoon = new BankAccount00();
		BankAccount00 park = new BankAccount00();
		
		yoon.deposit(5000);
		park.deposit(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}

class BankAccount00{
	int balance = 0;
	public void deposit(int amount) {
		balance += amount;
//		return balance;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
//		return balance;
	}
	
	public void checkMyBalance() {
		System.out.println("잔액 = "+ balance);
//		return balance;
				
	}
}