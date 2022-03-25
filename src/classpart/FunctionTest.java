package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + result + " 입니다");
		result = subtraction(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + result + " 입니다");
		result = multiplication(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + result + " 입니다");
		double divs = division(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + divs + " 입니다");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static int subtraction(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int multiplication(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static int division(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
	

}
