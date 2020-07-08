package org.comstudy21;

public class Member {
	public String name;
	public int age;
	public String phone;
	
	public Member(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + age + ", " + phone + "]";
	}
	
	@Override
	public int hashCode() {
		return (name+age+phone).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member tmp = (Member)obj;
			return name.equals(tmp.name) && age == tmp.age && phone.equals(tmp.phone);
		}
		return false;
	}
	
}
