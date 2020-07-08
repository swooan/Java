package org.comstudy21.model;

// DTO (VO) 역할을 한다.
public class People {
	int idx;
	String name;
	String phone;
	String address;
	
	public People() {
		this(0,"","","");
	}

	public People(int idx, String name, String phone, String address) {
		this.idx = idx;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return idx + " | " + name + " | " + phone + " | " + address;
	}
	
	
	
}
