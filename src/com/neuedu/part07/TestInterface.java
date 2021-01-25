package com.neuedu.part07;

public interface TestInterface {
	
	final int i=1;
	
	public abstract void testInterface();
	
	public int name();

}

interface TesrInterfaceSon1 extends TestInterface{
	public int name1();
}

interface TesrInterfaceSon2 extends TesrInterfaceSon1{
	
}

class TestInterfaceC implements TestInterface,TesrInterfaceSon1{

	@Override
	public void testInterface() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int name() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int name1() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}