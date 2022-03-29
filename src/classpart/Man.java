package classpart;

public class Man {
	int age;
	String name;
	boolean married;
	int numOfChildren;
	
	public static void main(String[] args) {
		Man man1 = new Man();
		man1.name = "James";
		man1.age = 40;
		man1.married = true;
		man1.numOfChildren = 3;
		
		System.out.println(man1.name);
		System.out.println(man1.age);
		System.out.println(man1.married);
		System.out.println(man1.numOfChildren);
		
	}
}


	
