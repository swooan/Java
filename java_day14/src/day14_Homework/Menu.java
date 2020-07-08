package day14_Homework;

class Menu {
	int inputNum1;

	public Menu() {
		
	}

	public Menu(int inputNum1) {
		
		this.inputNum1 = inputNum1;
		
		Input i = new Input();
		Output o = new Output();
			
			switch (inputNum1) {
			case 1:
				i.inputData();
				break;
			case 2:
				o.outputData();
				break;
//		case 3:
//			Search();
//			break;
//		case 4:
//			Modify();
//			break;
//		case 5:
//			Delete();
//			break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요 : ");
			
		}
	}

}
