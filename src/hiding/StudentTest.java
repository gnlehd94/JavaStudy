package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "leesangwon";
		studentLee.setStudentName("leesangwon");
		
		System.out.println(studentLee.getStudentName());

	}

}
