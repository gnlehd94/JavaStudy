package loopexample;

public class quiz3 {

	public static void main(String[] args) {
		int step = 1;
		int num = 1;
		
		for(step = 1; step <= 9; step++) {
			if(step % 2 != 0) continue;
			for(num = 1; num <= 9; num++) {
				System.out.println(step + "X" + num + "=" + step*num);
			}
			System.out.println();
		}

	}

}
