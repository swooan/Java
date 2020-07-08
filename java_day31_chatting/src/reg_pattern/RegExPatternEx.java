package reg_pattern;

import java.util.regex.Pattern;

public class RegExPatternEx {

	public static void main(String[] args) {
		// �̸��� ������ �˻��ϴ� ���� ǥ������ ��������
		// \w == [a-zA-z_0-9]
		
		String regExp = "\\w+@\\w+.\\w+(.\\w+)?";
		String data = "King@shop.com";
		
		if(args.length >= 1) {
			data = args[0];
		}
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println(data + " �� �ùٸ� ���� �Դϴ�.");
		}
		else {
			System.out.println(data + " �� �ùٸ��� ���� ���� �Դϴ�.");
		}
	}
	
	public static void test(String[] args) {
		String regExt = "(02|010)-\\d{3,4}-\\d{4}"; // 02 Ȥ�� 010�� ���� �� ���� \\ ���ڴ� 3~4�� ���� \\ ���ڴ� 4��
		String data = "010-1234-5678";
		
		if(args.length >= 1) {
			data = args[0];
		}
		boolean result = Pattern.matches(regExt, data);
		
		if(result) {
			System.out.println(data + " �� �ùٸ� ���� �Դϴ�.");
		}
		else {
			System.out.println(data + " �� �ùٸ��� ���� ���� �Դϴ�.");
		}
	}

}
