package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		
		Student3 studentKwon = new Student3();
		studentKwon.setStdentName("���ֵ�");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentKwon.studentName + " �й�:" + studentKwon.studentID
				+ " ī���ȣ:" + studentKwon.studentCard);
		
		Student3 studentJung = new Student3();
		studentJung.setStdentName("������");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentJung.studentName + " �й�:" + studentJung.studentID
				+ " ī���ȣ:" + studentJung.studentCard);
		
	}

}
