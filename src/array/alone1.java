package array;

public class alone1 {

	public static void main(String[] args) {
		char[][] alpha = new char[13][2];
				char small = 'a';
		
		for(int i = 0; i < alpha.length; i++) {
			for(int j = 0; j < alpha[i].length; j++) {
				alpha[i][j] = small;
				System.out.print(alpha[i][j]);
				small++;
			}
			System.out.println();
		}

	}

}
