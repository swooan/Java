package model;

public class Dto {
	 int num1;
	 int num2;
	 int num3;
	 int num4;
	
	 int s;
	 int b;
	
	public Dto() {
		this(0,0,0,0);
	}
	
	public Dto(int num1, int num2, int num3, int num4) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public Dto(int s, int b) {
		this.s = s;
		this.b = b;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public int getNum4() {
		return num4;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}

	public void printNums() {
		System.out.print("[ " + getNum1() + getNum2() + getNum3() + getNum4() + " = ");
	}
	public void printSbs() {
		System.out.println(getS() + " Strikes " + getB() + " Balls ]");
	}
	
}
