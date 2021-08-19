package com.Lambda;
interface BankAccount{
	default void show() {
		System.out.println("BankAccount");
	}
}
interface PaytmAccount{
	default void show() {
		System.out.println("PaytmAccount");
	}
}

public class BalanceCheck implements BankAccount,PaytmAccount {

	public static void main(String[] args) {
		BalanceCheck bcheck=new BalanceCheck();
		bcheck.show();
	}
	@Override
	public void show() {
		BankAccount.super.show();
		PaytmAccount.super.show();
	}

}
