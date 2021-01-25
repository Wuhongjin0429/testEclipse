package com.neuedu.part07;

public class TestBus {

	public static void main(String[] args) {
		
		payParkingFee(new BigBus(3));

	}
	
	//参数多态
	public static void payParkingFee(Bus bus){
		int parkingFee = bus.parkingFee();//ctrl+1 返回值
		System.out.println("停车收费"+parkingFee);
	}

}
