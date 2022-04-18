package quiz;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student edward = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi();
		edward.takeTaxi(taxi);
		edward.showInfo();
		taxi.showInfo();
		

	}

}
