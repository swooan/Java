package note;

public class note4 {
	
	static int[][] arr = new int[5][2];
	static int num = 1;

	public static void main(String[] args) {
		
		for(int i=0; i<2;i++) {
			for(int j=0; j<5;j++) {
				arr[j][i] = num++;
			}
		}
		
		printArr();
		
	}

	public static void printArr() {
		
		for(int i =0; i<arr.length; i++ ) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
}
