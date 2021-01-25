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
		 * ��ϵͳ������˾Ա���ṩ��һ����ϵͳ
		 * Ա������Ϣ��ϵͳ�Ļ������ݣ�Ա������Ϣ������ID ���� 
		 * �ṩ�Ĺ��ܵ㣺
		 * 1-------------ǩ��
		 * 2-------------ǩ��
		 * 3-------------��ѯ����Ϣ  ����¼��ʱ�� ���Բ�ѯ��7�� ��1��ǩ��ǩ��Ϊһ�죩
		 * 4-------------�˳�
		 * ǩ�����򿨵�Ա�������ǹ�˾����Ա��
		 * ǩ�ˣ��򿨵�Ա�������ǹ�˾����Ա����ֻ�е���ǩ����Ա���ſ���ǩ��
		 * ͬһ�첻���ظ�ǩ����ǩ��
		 * 
		 */
		 //0.��Ҫ��ʼ��һ����Ź�˾����Ա���ļ���
		 //1.Ӧ���и�ȷ��Ա����Ϣ��¼����
		 //2.�򿨼�¼������һ��������
		 //3.��֮���˳���¼����
		 HashMap<String,Employ> employ = getAllEmploy();//��ʼ����˾Ա��
		 
		 outer:while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("����������Ա�����");
			String checkId = scanner.nextLine();
			 
			//Ա��У��
			Employ employee = employ.get(checkId);
			if(employee==null){
				System.out.println("�޴�Ա�������ܵ���");
				continue;
			}else{
				
				
				//���й��ܴ���
				String msgg = operationSystem(employee);
				System.out.println(msgg);
				if(msgg.contains("�Ѿ�ǩ��")){
					continue outer;
				}else if (msgg.contains("�Ѿ�ǩ��")) {
					continue outer;
				}else if (msgg.equals("��Ա����δǩ��������ǩ��")) {
					String msgg2 = operationSystem(employee);
					System.out.println(msgg2);
					if(msgg2.equals("��Ա����δǩ��������ǩ��")){
						System.out.println("�쳣�����ǳ�");
						continue outer;
					}else{
						if(msgg2.contains("�Ѿ�ǩ��")){
							continue outer;
						}else if (msgg2.contains("�Ѿ�ǩ��")) {
							continue outer;
						}else if (msgg2.equals("�˳���¼")) {
							continue outer;
						}else if (msgg2.contains("�˳�ϵͳ")) {
							break outer;
						}
					}
				}else if (msgg.equals("�˳���¼")) {
					continue outer;
				}else if (msgg.contains("�����˳�ϵͳ")) {
					break outer;
				}
			}
		}
		 
	}

	private static String operationSystem(Employ employee) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1-------------ǩ��");
		System.out.println("2-------------ǩ��");
		System.out.println("3-------------��ѯ����Ϣ");
		System.out.println("4-------------�˳�");
		String type = sc.nextLine();
		String msgg = "";
		ArrayList<Record> arrayList = employee.getArrayList();
		int size = arrayList.size();
		if("1".equals(type)){//ǩ��
			//ȡ����һ���ļ�¼���ж��Ƿ�ǩ��
			if(size==0){//û�м�¼
				arrayList.add(new Record("ǩ��",getNowTime(),null));
				msgg = "��Ա���Ѿ�ǩ��";
				return msgg;
			}else{//�м�¼
				//�����7����¼
				if(size==7){
					//System.arraycopy(src, 1, dest, 0, 6); ����
					//ȥ����һ������
					arrayList.remove(0);
				}
				Record record = arrayList.get(arrayList.size()-1);//��ȡ����һ����¼����
				String checkFlag = record.getCheckFlag();
				if("ǩ��".equals(checkFlag)){//�Ѿ�ǩ����������ǩ��
					msgg = "��Ա���Ѿ�ǩ���������ٴ�ǩ��";
					return msgg;
				}else if ("δǩ��".equals(checkFlag)) {
					//�½�һ��ǩ����¼
					arrayList.add(new Record("ǩ��",getNowTime(),null));
					msgg = "��Ա���Ѿ�ǩ��";
					return msgg;
				}
			}
			
		}else if ("2".equals(type)) {//ǩ��
			if (size==0) {//û�м�¼��ʱ��
				msgg = "��Ա����δǩ��������ǩ��";
				return msgg;
			}else{//�м�¼��ʱ��
				Record record = arrayList.get(size-1);//��ȡ����һ����¼����
				String checkFlag = record.getCheckFlag();
				if("ǩ��".equals(checkFlag)){//�Ѿ�ǩ��������ǩ��
					msgg = "��Ա���Ѿ�ǩ��";
					record.setCheckOutTime(getNowTime());
					record.setCheckFlag("δǩ��");
					return msgg;
				}else if ("δǩ��".equals(checkFlag)) {
					//�Ѿ�ǩ��
					msgg = "��Ա���Ѿ�ǩ�ˣ������ٴ�ǩ��";
					return msgg;
				}
			}
			
		}else if ("3".equals(type)) {
			System.out.println("Ա����Ϣ������: "+employee.getName()+"���: "+employee.getID()+"�򿨼�¼: ");
			System.out.println();
			if(arrayList.size()==0){
				System.out.println("��");
			}else{
				arrayList.forEach(item ->{
					String checkOut = "";
					if (item.getCheckOutTime()==null) {
						checkOut = "����ǩ�˼�¼";
					}else{
						checkOut = item.getCheckOutTime();
					}
					System.out.println(item.getCheckInTime().substring(0,11)+"ǩ��ʱ�䣺"+item.getCheckInTime()+"   ǩ��ʱ�䣺"+checkOut);
				});
			}
			Scanner scanner = new Scanner(System.in);
			System.out.println("������һ������1���˳�����¼��������2");
			String operation = scanner.nextLine();
			if("1".equals(operation)){
				msgg = operationSystem(employee);
			}else if("2".equals(operation)){
				return "�˳���¼";
			}else{
				System.out.println("�޴˹���");
			}
			
		}else if ("4".equals(type)) {
			msgg = "�����˳�ϵͳ";
		}else {
			System.out.println("�޴˹���");
			operationSystem(employee);
		}
		return msgg;
	}

	private static String getNowTime() {//��ȡ���ڵĹ��߷���
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd��   HH:mm:ss");
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
	
	//���Ա���򿨼�¼������
	//����7��������7����ʱ�����ζ���
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
	
	private String checkFlag;//Ĭ����δǩ��״̬��Ա��ǩ��ʱ���ж�״̬Ϊǩ�ˣ�����ǩ����ǩ��֮��ֻ��ǩ�ˣ�ǩ��֮���Ϊδǩ��
	
	private String checkInTime;
	
	private String checkOutTime;
	
	public Record(String checkFlag,String checkInTime,String checkOutTime){
		this.checkFlag=checkFlag;
		this.checkInTime=checkInTime;
		this.checkOutTime=checkOutTime;
	}
	
	public Record(String checkInTime,String checkOutTime){
		this.checkFlag="δǩ��";
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















