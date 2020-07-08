package java_day07;

public class Ch05Ex01 {

	public static void main(String[] args) {
		//배열 선언하기
		// 타입 [] 식별자 = new 타입[크기];
		
		int[] arr = new int[5];
		arr[0] = 50;  // 처음 요소는 0번지
		arr[1] = 100;
		arr[2] = 150;
		arr[3] = 200;
		arr[4] = 250; // 마지막 요소는 size -1 번지
		
		//System.out.println("첫번째 요소에 들어있는 값은" + arr[0]);
		
		for(int i =0; i < 5; i++) {
			System.out.println(i + " : " + arr[i]); // 첨자로 변수 사용가능
		}
	}
	
}
