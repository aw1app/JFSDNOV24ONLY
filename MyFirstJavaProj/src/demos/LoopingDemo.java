package demos;

public class LoopingDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i * i);
		}

		// While
		System.out.println("WHILE DEMO");
		int i = 1;
		while (i <= 10) {
			System.out.println(i * i);
			i++;
		}
		
		
		//
		System.out.println("DO WHILE DEMO");
		int j = 1;
		do {
		 System.out.println(j*j);
		 j++;
		} while(j<=10);

	}

}
