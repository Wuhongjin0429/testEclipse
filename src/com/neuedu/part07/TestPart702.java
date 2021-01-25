package com.neuedu.part07;

import java.util.UUID;

/**
 * 多态
 * 通过父类引用调用方法，在程序运行时才能确定方法的形态功能的现象。
 * 
 * 形成多态的必要条件：
 * 1.有继承或实现关系
 * 2.需要重写方法
 * 3.父类引用指向子类的对象（向上转型）
 * 
 * 多态的使用场景：
 * 1.参数多态
 * 2.返回值多态
 * 
 * 静态 static
 * 可以修饰：方法，属性，代码块，一般用来修饰类的成员，不能修饰局部变量（用static修饰的类的成员可以不通过引用调用，直接用类名调用）
 * static 修饰属性能实现数据共享，为类变量，在类被载入时创建，类存在变量就存在
 * static 修饰方法为类方法，在类被载入时创建，类存在变量就存在
 * static 修饰代码块，静态代码块，优先于构造方法被调用，一般用于静态属性的初始化
 * 
 * 为什么静态方法中，只能调用静态方法和静态属性？
 * 因为在static修饰的类成员加载比较早，调用非静态成员或方法可能找不到。
 * 
 * 类被载入的时机
 * 1.new 对象时
 * 2.类名调用静态属性和方法时
 * 
 * 单例模式（设计模式）Singleton
 * 类 只能有一个实例（对象）
 * 1.不能让它创建多个对象，需要把构造函数藏起来private修饰
 * 2.还得通过构造函数创建对象，需要在单例类创建一个对象
 * 3.这个对象需要可以进行业务处理功能（逻辑），不能直接给人用，需要放在一个方法里获取
 * 4.这个方法的返回值就是这个对象，想要在外面使用 需要是静态方法
 * 5.静态方法里面对象 需要也是静态的，所以需要加上static，这时 对象又可以直接获取了
 * 6.为了不能直接点出这个对象，把这个对象定义过程设为私有
 * 
 * 两种单例模式
 * 饿汉式  new过程在外面
 * 懒汉式  new过程在方法里，进来先判断，如果对象没创建就创建，不然直接返回
 * 
 * 目前为止，还没有实现真正的单例，解决不了并发问题。
 * 
 * final 关键字
 * final 可以用来修饰类，属性，方法，局部变量
 * final 修饰类 这个类不能被继承
 * final 修饰属性 和局部变量时 都不可以被重新赋值
 * 修饰属性时，一般和static一起用
 * final 修饰方法的时候，不能被覆盖
 * 
 * 面试：final 和 static的区别？
 * 
 * 抽象类
 * 程序设计时，一个类没有特定需要实现的功能，只需要别的类继承实现它的行为，这种时候可以设置为一个抽象类。
 * 定义：使用abstract 修饰class
 * 组成：可以有正常类的成员，还可以有抽象方法
 * 抽象类可以继承类，抽象类里可以没有抽象方法
 * 抽象类不可以实例化（不能new）
 * 子类继承抽象类 需要实现父类的抽象方法，如果不实现 子类设置成抽象类
 * 
 * 接口
 * 接口描述了类的行为，是一套规范
 * [public] interface 接口名 [extends 父接口的名]{
 *  属性必须是常量，
 *  方法必须是抽象方法
 * }
 * 接口方法默认是抽象，可省略abstract
 * 接口可以多继承（extends）
 * 类实现（继承），接口用（implements）多个接口名用逗号相隔
 * 
 * 面试：抽象类和接口的区别？
 * 1.抽象类是个类只能单继承，接口可以实现多个
 * 2.抽象类可以有属性，接口只能有常量
 * 3.抽象类可以有非抽象方法，接口只能有抽象方法
 * 4.抽象类代表实物对象本身，接口代表对象的行为
 * 
 */
public class TestPart702 {

	static boolean bo;
	String bo1;
	
	public static void main(String[] args) {
		
		China china2 = new China();
		
		/*System.out.println(China.country);
		
		System.out.println(bo);*/
		
		System.out.println(UUID.randomUUID());//能生成唯一标识
		
		Salesman worker = new Worker();
		worker.eat();
			
	}
	
	//非静态方法里面  调用静态方法和属性(先后顺序，static先加载出来，可以调用)
	public void test(){
		System.out.println(bo);
	}

}

class China{
	
	String name;
	static String MAX_COUNTRY;
	String age;
	
	public China(){
		System.out.println("我是构造方法");
	}
	
	static{
		MAX_COUNTRY="中国";
		/*System.out.println("我是静态代码块");*/
	}
	
	{
		System.out.println("我是代码块");
	}
	
}