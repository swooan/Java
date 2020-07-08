package org.comstudy21.day16_2;


// 인터페이스는 규격(명세서)
interface Calc {
	double PI = 3.14;
	int error = -99999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
//인터페이스를 상속받고 구현하지 않으면 추상이 된다.
abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		
		return num1 - num2;
	}
	
}

class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			result = error;
		}
		return result;
	}
	
	void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	
}

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 =10;
		int num2 = 0;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1,num2));
		System.out.println(calc.substract(num1,num2));
		System.out.println(calc.times(num1,num2));
		System.out.println(calc.divide(num1,num2));
		
		calc.showInfo();
		
		//업캐스팅
		Calc calc1 = new CompleteCalc();
		System.out.println(calc1.add(num1,num2));
		System.out.println(calc1.substract(num1,num2));
		System.out.println(calc1.times(num1,num2));
		System.out.println(calc1.divide(num1,num2));
		
		if(calc1 instanceof CompleteCalc) {
			//다운캐스팅
			((CompleteCalc)calc1).showInfo();
		}

	}

}
