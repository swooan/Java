package View;

public class View extends Myview {
	@Override
	public void run() {
		String s = (String) request.get("name");
		System.out.print(s + "  ");
	}

}
