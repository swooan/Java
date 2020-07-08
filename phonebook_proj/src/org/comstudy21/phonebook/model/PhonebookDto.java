package org.comstudy21.phonebook.model;

public class PhonebookDto {
	// people에 대한 정보가 dto 에 저장
	// 그릇이다 = java bin이라고 한다.
	int idx;
	String name;
	String phone;
	String email;
	
	public PhonebookDto() {
		this(0, "", "", "");
	}

	public PhonebookDto(int idx, String name, String phone, String email) {
		this.idx = idx;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "[" + idx + ", " + name + ", " + phone + ", " + email + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
