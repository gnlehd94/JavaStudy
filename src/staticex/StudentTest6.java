package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		
		Student3 studentKwon = new Student3();
		studentKwon.setStdentName("권휘동");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentKwon.studentName + " 학번:" + studentKwon.studentID
				+ " 카드번호:" + studentKwon.studentCard);
		
		Student3 studentJung = new Student3();
		studentJung.setStdentName("정신혜");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentJung.studentName + " 학번:" + studentJung.studentID
				+ " 카드번호:" + studentJung.studentCard);
		
	}

}
