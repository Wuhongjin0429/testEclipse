package com.neuedu.part07;


//英语系：演讲，期末考试，期中考试；

//计算机系：操作能力，英语写作，期中考试，期末考试；

//文学系：演讲，作品，期末考试，期中考试;

public class Student {
	
	private int qizhong;
	private int qimo;
	
	//学号:XXXXXXXX 姓名：XXX 性别：X 年龄：XX 综合成绩：XX
	private int stuNo;
	private String name;
	private char sex;
	private int age;
	
	
	public Student(int qizhong,int qimo,int stuNo,String name,char sex,int age){
		this.qimo=qimo;
		this.qizhong=qizhong;
		this.stuNo=stuNo;
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	
	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getQizhong() {
		return qizhong;
	}
	public void setQizhong(int qizhong) {
		this.qizhong = qizhong;
	}
	public int getQimo() {
		return qimo;
	}
	public void setQimo(int qimo) {
		this.qimo = qimo;
	}
	
	public double allscore(){
		return this.qimo*0.5+this.qizhong*0.5;
	}
	
}

class English extends Student{
	
	private int speech;//演讲
	
	public English(int qizhong,int qimo,int speech,int stuNo,String name,char sex,int age){
		super(qizhong, qimo, stuNo,name, sex, age);
		this.speech=speech;
	}

	public int getSpeech() {
		return speech;
	}

	public void setSpeech(int speech) {
		this.speech = speech;
	}
	
	@Override
	public double allscore(){
		return this.speech*0.5+getQimo()*0.25+getQizhong()*0.25;
	}
}

class Computer extends Student{
	
	private int enWrite;
	
	private int operation;

	public Computer(int qizhong, int qimo,int enWrite,int operation,int stuNo,String name,char sex,int age) {
		super(qizhong, qimo, stuNo, name, sex, age);
		this.enWrite=enWrite;
		this.operation=operation;
	}

	public int getEnWrite() {
		return enWrite;
	}

	public void setEnWrite(int enWrite) {
		this.enWrite = enWrite;
	}

	public int getOperation() {
		return operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

	@Override
	public double allscore() {
		return this.operation*0.4+this.enWrite*0.2+getQimo()*0.2+getQizhong()*0.2;
	}
}

class Chinese extends Student{
	
	private int speech;
	
	private int works;

	public Chinese(int qizhong, int qimo,int speech,int works,int stuNo,String name,char sex,int age) {
		super(qizhong, qimo, stuNo, name, sex, age);
		this.speech=speech;
		this.works=works;
	}

	public int getSpeech() {
		return speech;
	}

	public void setSpeech(int speech) {
		this.speech = speech;
	}

	public int getWorks() {
		return works;
	}

	public void setWorks(int works) {
		this.works = works;
	}

	@Override
	public double allscore() {
		return this.speech*0.35+this.works*0.35+getQimo()*0.15+getQizhong()*0.15;
	}
}
