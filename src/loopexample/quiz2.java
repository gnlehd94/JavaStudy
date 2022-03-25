package loopexample;

public class quiz2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int sum = 0;
		char operator = '+';
		
		switch(operator) {
		case '+' : sum = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + sum);
		break;
		case '-' : sum = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + sum);
		break;
		case '*' : sum = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + sum);
		break;
		case '/' : sum = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + sum);
		break;
		}
	}

}
