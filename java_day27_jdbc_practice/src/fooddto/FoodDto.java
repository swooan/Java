package fooddto;

public class FoodDto {
	int no;
	String name;
	int price;
	
	public FoodDto() {}
	
	public FoodDto(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "�޴� [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
