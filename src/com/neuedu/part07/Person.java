package com.neuedu.part07;

public interface Person {
	
	public void eat();
	
	public void speak();
	
	public void live();
	

}

interface Salesman extends Person{
	
	
}

interface CollegesStudent extends Person{
	
	public void study();
	
}

class Worker implements Salesman,CollegesStudent{

	@Override
	public void eat() {
		System.out.println("会干饭");
	}

	@Override
	public void speak() {
		System.out.println("会说话");
	}

	@Override
	public void live() {
		System.out.println("还活着");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}
	
}