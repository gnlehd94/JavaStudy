package ifexample;

public class quiz1 {

	public static void main(String[] args) {
		int floor = 5;
		String name;
		
		switch(floor) {
		case 1 : name = "약국";
		break;
		case 2 : name = "정형외과";
		break;
		case 3 : name = "피부과";
		break;
		case 4 : name = "치과";
		break;
		default: name = "헬스클럽";
		}
		System.out.println(floor + "층 " + name + " 입니다.");

	}

}
