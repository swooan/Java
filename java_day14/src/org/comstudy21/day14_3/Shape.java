package org.comstudy21.day14_3;

class Shape {
	private double res;

	protected void area() {
		System.out.printf("������ %.2f �Դϴ�.\n" , res);
	}
	
	public void setRes(double res) {
		this.res = res;
	}
	public double getRes() {
		return res;
	}
}
