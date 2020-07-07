package model;

public class Dto {
	private String date;
	private String type;
	private int num;
	private String name;
	
	private String name2;
	
	private int cnt;
	private int dcnt;
	
	
	public Dto() {}

	public Dto(int cnt, String date, int dcnt, String type, int num, String name) {
		this.date = date;
		this.type = type;
		this.cnt = cnt;
		this.dcnt = dcnt;
		this.num = num;
		this.name = name;
	}
	
	public Dto(int cnt, int dcnt, String type) {
		this.cnt = cnt;
		this.dcnt = dcnt;
		this.type = type;
	}
	
	public Dto(int cnt, String date) {
		this.cnt = cnt;
		this.date = date;
	}
	
	public Dto(String name2) {
		this.name2 = name2;
	}
	
	public Dto(String name, String date, String type, int num, String name2) {
		this.name = name;
		this.date = date;
		this.type = type;
		this.num = num;
		this.name2 = name2;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getDcnt() {
		return dcnt;
	}

	public void setDcnt(int dcnt) {
		this.dcnt = dcnt;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String day) {
		this.date = day;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	@Override
	public String toString() {
		return " [ " + name + "님의 예약정보는 " + date + " " + type + " " + num+ " 번 좌석 입니다. ]";
	}
	
	
}
