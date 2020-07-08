package day14_Homework;

class Output {
	Input input;
	
	final int MAX = 100;
	int top = 0;
	String[][] inputData;
	
	
	
	public Output() {
		inputData = new String[MAX][3];
	}
	
	void Output(Input input) {
		this.inputData[top][0] = input.inputData[top][0];
		this.inputData[top][1] = input.inputData[top][1];
		this.inputData[top][2] = input.inputData[top][2];
		
		top++;
	}

	void outputData() {
		
		System.out.println("--------------------------------");
		System.out.println("출력 기능을 선택하셨습니다.");
		System.out.println("이름\t 전화번호\t 지역");
		System.out.println("==================================");
		for (int i=0; i<top; i++) {
			for(int j=0; j < 3; j++) {
				System.out.println(inputData[i][j] + "\t");
				
			}
			
		}
		
		
		
	}

}
