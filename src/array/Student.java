package array;

public class Student {
	static int IDvaule = 1000;
	int studentID;
	String studentName;
	
	
	public Student(int studentID, String studentName) {
		IDvaule++;
		this.studentID = IDvaule;
		this.studentName = studentName;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + "," + studentName);
	}
}
