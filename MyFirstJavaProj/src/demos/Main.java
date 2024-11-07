package demos;

public class Main {
	public static void main(String[] args) {
// Declare and initialize an integer array with 10 elements
		int[] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

// Access and print the second element of the array
		System.out.println(myArray[1]);

		int[][] numbers = { 
				{ 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 0 } 
				};
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.println("");
		}

	}
}


