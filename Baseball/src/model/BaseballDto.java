package model;

public class BaseballDto {
	String name;
	int arr;
	int col;

	public BaseballDto() {
		this("",0,0);
	}
	
	public BaseballDto(String name, int arr, int col) {
		this.name = name;
		this.arr = arr;
		this.col = col;
	}

	public int getArr() {
		return arr;
	}

	public void setArr(int arr) {
		this.arr = arr;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[ " + name + "님의 자리는 " + arr + "행 " + col + "열 입니다. ]";
	}


	
}
