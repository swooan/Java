package Model;

public class Dao {
	public String[][][][]total;
	public Dao() {
		total=new String[3][9][3][3];
	}
	public void insert(Dto dto) {
		int d=dto.date;
		int t=dto.type;
		int r=dto.row;
		int c=dto.col;
		total[d][t][r][c]=dto.name;
	}
	
	public String view(int d,int t,int r,int c) {
		return total[d][t][r][c];
	}
}
