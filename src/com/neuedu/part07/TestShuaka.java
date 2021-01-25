package com.neuedu.part07;

public class TestShuaka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pay(new Debit(1000),1500);

	}
	
	public static void pay(BankCard bankCard,double paymoney){
		
		bankCard.setMoney(paymoney);
		
	}

}
