package staticex;

public class Student3 {

	private static int serialNum = 1000;
	int studentCard;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
		studentCard = studentID + 100;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStdentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
	

}
