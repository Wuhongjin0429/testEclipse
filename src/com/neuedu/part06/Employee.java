package com.neuedu.part06;

/**
 * 打工人类
 * 
 *
 */
public class Employee {
	
	//先写属性
	//属性默认值
	String name;
	int age;
	double sal;
	
	//构造方法   不需要写返回值类型
	public Employee(){
		System.out.println("这是Employee无参的构造方法");
	}
	public Employee(String _name,int _age,double _sal){//有参
		name=_name;//this.name=name;
		age=_age;//this.age=age;
		sal=_sal;//this.sal=sal;
	}
	public Employee(String _name,int _age){//有参
		name=_name;
		age=_age;
		sal=500;
	}
	
	//写行为（方法）
	//获取名字
	public String showName(){
		System.out.println("员工姓名为："+name);
		return name;
	}
	/**
	 * 获取年纪
	 * @param 为空
	 * @return age 年纪
	 */
	public int showAge(){
		System.out.println("员工年纪为："+age);
		return age;
	}
	/**
	 * 修改名字
	 * @param _name 预期修改的名字
	 */
	public void updateName(String _name){
		name = _name;
	}
	/**
	 * 领取工资
	 * @return sal
	 */
	public double getSal(){
		System.out.println("The sal of this month is"+sal);
		return sal;
	}

}
