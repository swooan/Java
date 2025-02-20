package org.comstudy21.model;

public class Dto {
	private int no;
	private String name;
	private String email;
	private String phone;
	
	public Dto() {}

	public Dto(int no, String name, String email, String phone) {
		this.no = no;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "[" + no + ", " + name + ", " + email + ", " + phone + "]";
	}
	
	
}
