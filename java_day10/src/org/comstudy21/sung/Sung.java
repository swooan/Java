package org.comstudy21.sung;

import org.comstudy21.day10.MyUtil;
import static java.lang.System.out;
import static java.lang.System.in;

public class Sung {
	static String[] menuStr = {"INPUT","OUTPUT","SEARCH","MODIFY","DELETE","END"};
	static final int MAX = 100;
	static int top = 0;
	
	static String[] name = new String[MAX];
	static int[] kor = new int[MAX];
	static int[] eng = new int[MAX];
	static int[] mat = new int[MAX];
	static int[] total = new int[MAX];
	static double[] avg = new double[MAX];
	static char[] grade = new char[MAX];
	static int[] rank = new int[MAX];

	static int menu() {
		for(int i = 0; i < menuStr.length; i++) {
			out.print("(" + (i+1) + ")" + menuStr[i] + " ");
		}
		out.print("\nChoice : ");
		int no = MyUtil.getNum();
		
		return no;
	}
	
	static void inputData() {
		out.print("���� : ");
		name[top] = MyUtil.getStr();
		out.print("���� ���� : ");
		kor[top] = MyUtil.getNum();
		out.print("���� ���� : ");
		eng[top] = MyUtil.getNum();
		out.print("���� ���� : ");
		mat[top] = MyUtil.getNum();
		
		//�Է� ó�� �Ϸ� �� top ����
		top++;
	}
	
	static char getGrade(double avg) {
		char grade = 'F';
		
		switch((int)avg/10 ) {
		case 10: case 9 : grade='A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		}
		
		return grade;
	}
	
	static void setData(int idx, int t) {
		total[idx] = kor[idx] + eng[idx] + mat[idx];
		avg[idx] = total[idx]/3.0;
		grade[idx] = getGrade(avg[idx]);
		
		for(int i= 0; i<t; i++) {
			rank[i] = 1;
			for(int j=0; j<t; j++) {
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
			
		}
	}
	static void input() {
		out.println("::::: �Է� ��� :::::");
		//�Է�
		inputData();
		//����, ���, ����, ���
		setData(top-1, top); // ó�� top�� idx �ι�° top�� top, top�� ���� �޶��� �� �ִ�
	}
	
	static void printRow(int i) {
		if(i<0||i>=top ) {
			out.println("������ ��� ÷�ڰ� ��� �Ǿ����ϴ�!");
			return;
		}
		out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%d\t",i,name[i],kor[i],eng[i],mat[i],total[i],avg[i],grade[i],rank[i]);
		out.println();
	}
	
	static void printColumnName() {
		out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t","��ȣ","����","����","����","����","����","���","����","���");
		out.println();
		out.println("--------------------------------------------------------------------");
	}
	
	static void output() {
		out.println("::::: ��� ��� :::::");
		printColumnName();
		for(int i=0; i<top; i++) {
			printRow(i);
			System.out.println();
		}
	}
	
	static int findIdx(int startIdx, String sName) {
		
		for(int i = startIdx; i<top; i++) {
			if(sName.equals(name[i])) {
				return i;
			}
		}
		
		return -1;
	}
	
	static void search() {
		out.println("::::: �˻� ��� :::::");
		out.print("�˻��� �̸� : ");
		String searchName = MyUtil.getStr();
		
		printColumnName();
		int idx = -1;
		while((idx = findIdx(idx+1, searchName)) != -1) {
			printRow(idx);
		}
	}
	static void modify() {
		out.println("::::: ���� ��� :::::");
		out.print("���� �� �̸� : ");
		
		String modifyName = MyUtil.getStr();
		
		printColumnName();
		int idx = -1;
		int[] modifyList = new int[top];
		int cnt = 0;
		while((idx = findIdx(idx+1, modifyName)) != -1) {
			printRow(idx);
			modifyList[cnt++] = idx;
		}
		
		if(cnt == 0) {
			out.println("������ �׸��� �����ϴ�.");
			return;
		}
		
		out.print("���� �� �׸��� ��ȣ�� �Է��ϼ��� : ");
		int modifyNo = MyUtil.getNum();
		// ��ȿ�� �˻�
		boolean isOk = false;
		for(int i=0; i<cnt; i++) {
			if(modifyList[i] == modifyNo) {
				isOk = true;
			}
		}
		if(!isOk) {
			out.println("���� �� �׸��� ��ȣ�� �߸� �Է� �Ͽ����ϴ�!");
			return;
		}
		
		out.print("�� �̸� : ");
		name[modifyNo] = MyUtil.getStr();
		out.print("�� �������� : ");
		kor[modifyNo] = MyUtil.getNum();
		out.print("�� �������� : ");
		eng[modifyNo] = MyUtil.getNum();
		out.print("�� �������� : ");
		mat[modifyNo] = MyUtil.getNum();
		
		setData(modifyNo, top);
		
		
	}
	static void delete() {
		out.println("::::: ���� ��� :::::");
		out.print("������ �̸� : ");
		String deleteName = MyUtil.getStr();
		
		printColumnName();
		int idx = -1;
		int[] modifyList = new int[top];
		int cnt = 0;
		while((idx = findIdx(idx+1, deleteName)) != -1) {
			printRow(idx);
			modifyList[cnt++] = idx;
		}
		
		if(cnt == 0) {
			out.println("������ �׸��� �����ϴ�.");
			return;
		}
		
		out.print("���� �� �׸��� ��ȣ�� �Է��ϼ��� : ");
		int deleteNo = MyUtil.getNum();
		// ��ȿ�� �˻�
		boolean isOk = false;
		for(int i=0; i<cnt; i++) {
			if(modifyList[i] == deleteNo) {
				isOk = true;
			}
		}
		if(!isOk) {
			out.println("���� �� �׸��� ��ȣ�� �߸� �Է� �Ͽ����ϴ�!");
			return;
		}
		
		for(int i = deleteNo; i < top-1; i++) {
			
			name[i] = name[i+1];
			kor[i] = kor[i+1];
			eng[i] = eng[i+1];
			mat[i] = mat[i+1];
			total[i] = total[i+1];
			avg[i] = avg[i+1];
			grade[i] = grade[i+1];
			
			setData(top-1,top);
		}
		top--;
		
	}
	static void end() {
		out.println("::::: ���� ��� :::::");
		out.println("�����ϼ̽��ϴ�!");
		System.exit(0);
		
	}
	
	public static void play() {
		switch(menu()) {
		case 1 : input(); break;
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : end(); break;
		default : out.println("��ȿ�� ������ �ƴմϴ�.");
		}

	}
	
	static void initData(String n, int k, int e, int m) {
		
		name[top] = n;
		kor[top] = k;
		eng[top] = e;
		mat[top] = m;
		
		//�Է� ó�� �Ϸ� �� top ����
		top++;
		
		setData(top-1,top);
	}
	
	public static void main(String[] args) {
		initData("kim",90,90,90);
		initData("lee",80,80,80);
		initData("park",70,70,70);
		initData("kang",60,60,60);
		while(true) {
			play();
			out.println();
		}
	}

}
