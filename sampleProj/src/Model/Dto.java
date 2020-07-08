package Model;

public class Dto {
	int date;
	int type;
	int row;
	int col;
	String name;
	public Dto(int date,int type,int row,int col, String name) {
		this.date=date;
		this.type=type;
		this.row=row;
		this.col=col;
		this.name=name;
	}
}
