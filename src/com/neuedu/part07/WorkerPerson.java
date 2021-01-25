package com.neuedu.part07;

public abstract class WorkerPerson {
	
	private String name;
	
	public abstract void eat();
	
	public abstract void speak();
	
	public abstract void live();
	
	public static void main(String[] args) {
		WorkerPerson consumer = new CollegeStudent();
		consumer.speak();
	}

}

interface Consumer{
	
	public void userCredit();
	
}

class CollegeStudent extends WorkerPerson implements Consumer{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void live() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userCredit() {
		System.out.println("ø…“‘À¢ø®");
	}
	
}