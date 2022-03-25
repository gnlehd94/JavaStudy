package loopexample;

public class quiz4 {

	public static void main(String[] args) {
		int dan = 0;
		int num = 0;
		
		for(dan = 2; dan <= 9; dan++) {
			for(num = 1; num <= 9; num++) {
				if(dan < num) break;
				System.out.println(dan + "X" + num + "=" + dan*num);
			}
			System.out.println();
		}
	}

}
