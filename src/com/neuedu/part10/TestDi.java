package com.neuedu.part10;

import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class TestDi {
	
	public static void main(String[] args) {
		/*
		 * 打卡系统：给公司员工提供的一个打卡系统
		 * 员工的信息是系统的基础数据，员工的信息包括：ID 姓名 
		 * 提供的功能点：
		 * 1-------------签到
		 * 2-------------签退
		 * 3-------------查询打卡信息  （记录打卡时间 可以查询近7天 ，1次签到签退为一天）
		 * 4-------------退出
		 * 签到：打卡的员工必须是公司已有员工
		 * 签退：打卡的员工必须是公司已有员工，只有当天签到的员工才可以签退
		 * 同一天不能重复签到，签退
		 * 
		 */
		 //0.需要初始化一个存放公司现有员工的集合
		 //1.应该有个确认员工信息登录环节
		 //2.打卡记录存在另一个集合中
		 //3.打卡之后退出登录界面
		 HashMap<String,Employ> employ = getAllEmploy();//初始化公司员工
		 
		 outer:while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入您的员工编号");
			String checkId = scanner.nextLine();
			 
			//员工校验
			Employ employee = employ.get(checkId);
			if(employee==null){
				System.out.println("无此员工，不能登入");
				continue;
			}else{
				
				
				//进行功能处理
				String msgg = operationSystem(employee);
				System.out.println(msgg);
				if(msgg.contains("已经签到")){
					continue outer;
				}else if (msgg.contains("已经签退")) {
					continue outer;
				}else if (msgg.equals("该员工还未签到，不能签退")) {
					String msgg2 = operationSystem(employee);
					System.out.println(msgg2);
					if(msgg2.equals("该员工还未签到，不能签退")){
						System.out.println("异常操作登出");
						continue outer;
					}else{
						if(msgg2.contains("已经签到")){
							continue outer;
						}else if (msgg2.contains("已经签退")) {
							continue outer;
						}else if (msgg2.equals("退出登录")) {
							continue outer;
						}else if (msgg2.contains("退出系统")) {
							break outer;
						}
					}
				}else if (msgg.equals("退出登录")) {
					continue outer;
				}else if (msgg.contains("您已退出系统")) {
					break outer;
				}
			}
		}
		 
	}

	private static String operationSystem(Employ employee) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1-------------签到");
		System.out.println("2-------------签退");
		System.out.println("3-------------查询打卡信息");
		System.out.println("4-------------退出");
		String type = sc.nextLine();
		String msgg = "";
		ArrayList<Record> arrayList = employee.getArrayList();
		int size = arrayList.size();
		if("1".equals(type)){//签到
			//取最新一条的记录，判断是否签到
			if(size==0){//没有记录
				arrayList.add(new Record("签到",getNowTime(),null));
				msgg = "该员工已经签到";
				return msgg;
			}else{//有记录
				//如果有7条记录
				if(size==7){
					//System.arraycopy(src, 1, dest, 0, 6); 数组
					//去掉第一条数据
					arrayList.remove(0);
				}
				Record record = arrayList.get(arrayList.size()-1);//获取最新一条记录处理
				String checkFlag = record.getCheckFlag();
				if("签到".equals(checkFlag)){//已经签到，不能再签到
					msgg = "该员工已经签到，不能再次签到";
					return msgg;
				}else if ("未签到".equals(checkFlag)) {
					//新建一条签到记录
					arrayList.add(new Record("签到",getNowTime(),null));
					msgg = "该员工已经签到";
					return msgg;
				}
			}
			
		}else if ("2".equals(type)) {//签退
			if (size==0) {//没有记录的时候
				msgg = "该员工还未签到，不能签退";
				return msgg;
			}else{//有记录的时候
				Record record = arrayList.get(size-1);//获取最新一条记录处理
				String checkFlag = record.getCheckFlag();
				if("签到".equals(checkFlag)){//已经签到，可以签退
					msgg = "该员工已经签退";
					record.setCheckOutTime(getNowTime());
					record.setCheckFlag("未签到");
					return msgg;
				}else if ("未签到".equals(checkFlag)) {
					//已经签退
					msgg = "该员工已经签退，不能再次签退";
					return msgg;
				}
			}
			
		}else if ("3".equals(type)) {
			System.out.println("员工信息：姓名: "+employee.getName()+"编号: "+employee.getID()+"打卡记录: ");
			System.out.println();
			if(arrayList.size()==0){
				System.out.println("空");
			}else{
				arrayList.forEach(item ->{
					String checkOut = "";
					if (item.getCheckOutTime()==null) {
						checkOut = "暂无签退记录";
					}else{
						checkOut = item.getCheckOutTime();
					}
					System.out.println(item.getCheckInTime().substring(0,11)+"签到时间："+item.getCheckInTime()+"   签退时间："+checkOut);
				});
			}
			Scanner scanner = new Scanner(System.in);
			System.out.println("返回上一层输入1，退出到登录界面输入2");
			String operation = scanner.nextLine();
			if("1".equals(operation)){
				msgg = operationSystem(employee);
			}else if("2".equals(operation)){
				return "退出登录";
			}else{
				System.out.println("无此功能");
			}
			
		}else if ("4".equals(type)) {
			msgg = "您已退出系统";
		}else {
			System.out.println("无此功能");
			operationSystem(employee);
		}
		return msgg;
	}

	private static String getNowTime() {//获取日期的工具方法
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss");
		String parse = simpleDateFormat.format(new Date());
		return parse;
	}	

	private static HashMap<String,Employ> getAllEmploy() {
		
		HashMap<String,Employ> map = new HashMap<>();
		
		map.put("1001",new Employ(1001, "Tom"));
		map.put("1002",new Employ(1002, "Jerry"));
		map.put("1003",new Employ(1003, "Mark"));
		map.put("1004",new Employ(1004, "Smith"));
		map.put("1005",new Employ(1001, "Martin"));
		
		return map;
	}

}


class Employ{
	
	private int ID;
	
	private String name;
	
	//存放员工打卡记录的属性
	//最多存7条，超过7条，时间依次顶掉
	private ArrayList<Record> arrayList = new ArrayList<>();
	
	public Employ(int ID, String name){
		this.ID=ID;
		this.name=name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Record> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<Record> arrayList) {
		this.arrayList = arrayList;
	}
	
	
}

class Record{
	
	private String checkFlag;//默认是未签到状态，员工签到时，判断状态为签退，即可签到，签到之后只能签退，签退之后改为未签到
	
	private String checkInTime;
	
	private String checkOutTime;
	
	public Record(String checkFlag,String checkInTime,String checkOutTime){
		this.checkFlag=checkFlag;
		this.checkInTime=checkInTime;
		this.checkOutTime=checkOutTime;
	}
	
	public Record(String checkInTime,String checkOutTime){
		this.checkFlag="未签退";
		this.checkInTime=checkInTime;
		this.checkOutTime=checkOutTime;
	}
	
	public Record(String checkFlag2, Date nowTime, Object checkOutTime2) {
		// TODO Auto-generated constructor stub
	}

	public String getCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
}















