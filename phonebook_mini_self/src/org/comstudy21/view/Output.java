package org.comstudy21.view;

public class Output extends MyView {
Input input;	
	
	public Output() {
		inputData = new String[MAX][3];
	}
	
	void Output(Input input) {
		this.inputData[top][0] = input.inputData[top][0];
		this.inputData[top][1] = input.inputData[top][1];
		this.inputData[top][2] = input.inputData[top][2];
		
		top++;
	}

	@Override
	public void display() {

		System.out.println("--------------------------------");
		System.out.println("��� ����� �����ϼ̽��ϴ�.");
		System.out.println("�̸�\t ��ȭ��ȣ\t ����");
		System.out.println("==================================");
		for (int i=0; i<top; i++) {
			for(int j=0; j < 3; j++) {
				System.out.println(inputData[i][j] + "\t");
				
			}
			
		}
		
	}
}
