package reg_pattern;

import java.util.regex.Pattern;

public class RegExPatternEx {

	public static void main(String[] args) {
		// 이메일 형식을 검사하는 정규 표현식을 만들어보세요
		// \w == [a-zA-z_0-9]
		
		String regExp = "\\w+@\\w+.\\w+(.\\w+)?";
		String data = "King@shop.com";
		
		if(args.length >= 1) {
			data = args[0];
		}
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println(data + " 는 올바른 형식 입니다.");
		}
		else {
			System.out.println(data + " 는 올바르지 못한 형식 입니다.");
		}
	}
	
	public static void test(String[] args) {
		String regExt = "(02|010)-\\d{3,4}-\\d{4}"; // 02 혹은 010만 넣을 수 있음 \\ 숫자는 3~4개 까지 \\ 숫자는 4개
		String data = "010-1234-5678";
		
		if(args.length >= 1) {
			data = args[0];
		}
		boolean result = Pattern.matches(regExt, data);
		
		if(result) {
			System.out.println(data + " 는 올바른 형식 입니다.");
		}
		else {
			System.out.println(data + " 는 올바르지 못한 형식 입니다.");
		}
	}

}
