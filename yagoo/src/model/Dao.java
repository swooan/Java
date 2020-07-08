package model;

import java.util.ArrayList;

public class Dao {
	ArrayList<Dto> nums;
	ArrayList<Dto> sb;
	
	public Dao() {
		nums = new ArrayList<Dto>();
		sb = new ArrayList<Dto>();
	}
	
	public Dao(ArrayList<Dto> nums, ArrayList<Dto> sb) {
		this.nums = nums;
		this.sb = sb;
	}
	
	public void insertNums(Dto dto) {
		int num1 = dto.num1;
		int num2 = dto.num2;
		int num3 = dto.num3;
		int num4 = dto.num4;
		nums.add(dto);
	}
	
	public void insertSb(Dto sb) {
		int s = sb.s;
		int b = sb.b;
		this.sb.add(sb);
	}

	public ArrayList<Dto> selectNum() {
		ArrayList<Dto> nums2 = new ArrayList<Dto>();
		for(int i = 0; i < nums.size(); i++) {
			Dto dtoNum = nums.get(i);
			int num1 = dtoNum.getNum1();
			int num2 = dtoNum.getNum2();
			int num3 = dtoNum.getNum3();
			int num4 = dtoNum.getNum4();
			Dto newDtoNum = new Dto(num1, num2, num3, num4);
			nums2.add(newDtoNum);
		}
		return nums2;
	}
	public ArrayList<Dto> selectSb() {
		ArrayList<Dto> sb2 = new ArrayList<Dto>();
		for(int i = 0; i < sb.size(); i++) {
			Dto dtoNum = sb.get(i);
			int s = dtoNum.getS();
			int b = dtoNum.getB();
			Dto newDtoSb = new Dto(s,b);
			sb2.add(newDtoSb);
		}
		return sb2;
	}
		
}
