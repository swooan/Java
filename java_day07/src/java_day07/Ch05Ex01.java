package java_day07;

public class Ch05Ex01 {

	public static void main(String[] args) {
		//�迭 �����ϱ�
		// Ÿ�� [] �ĺ��� = new Ÿ��[ũ��];
		
		int[] arr = new int[5];
		arr[0] = 50;  // ó�� ��Ҵ� 0����
		arr[1] = 100;
		arr[2] = 150;
		arr[3] = 200;
		arr[4] = 250; // ������ ��Ҵ� size -1 ����
		
		//System.out.println("ù��° ��ҿ� ����ִ� ����" + arr[0]);
		
		for(int i =0; i < 5; i++) {
			System.out.println(i + " : " + arr[i]); // ÷�ڷ� ���� ��밡��
		}
	}
	
}
