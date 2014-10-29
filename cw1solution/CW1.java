import java.util.Scanner;

public class CW1 {
	private final static int SIZE = 100;
	private final static int SENTINEL = 0;

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int[] intarr1 = new int[SIZE];
		int[] intarr2 = new int[SIZE];

		fillArray(sc, intarr1, "1");
		fillArray(sc, intarr2, "2");

		if (intarr1[0] == SENTINEL && intarr2[0] == SENTINEL) {
			System.out.println("Both arrays are empty");
			System.exit(-1);
		}

		System.out.print("Values for array 1 is: ");
		displayElements(intarr1);

		System.out.print("Values for array 2 is: ");
		displayElements(intarr2);

		int[] inter = intersection(intarr1, intarr2);
		int sz = size(inter);
		System.out.print("Common data is: ");
		displayElements(inter);

		
		System.out.println("Number of common data is: " + sz );

		System.out.print("Non-common values for array 1 is: ");
		displayElements(difference(intarr1, inter));

		System.out.print("Non-common values for array 2 is: ");
		displayElements(difference(intarr2, inter));

		sc.close();
	}

	private static void fillArray(Scanner sc, int[] arr, String prompt) {
		int index = 0;
		while (true) {
			System.out.print("Enter data for array " + prompt
					+ " (0 to finish): ");
			int value = sc.nextInt();
			if (value == SENTINEL)
				break;
			if (member(value, arr, index)) {
				System.out.println("" + value
						+ " is already a member of array " + prompt);
				System.out.println("Please re-enter the value");
			} else {
				arr[index++] = value;
			}
		}
	}

	private static boolean member(int value, int[] arr, int count) {
		for (int i = 0; i <= count; i++) {
			if (arr[i] == value)
				return true;
		}
		return false;
	}

	private static void displayElements(int[] arr) {
		for (int x : arr) {
			if (x == SENTINEL)
				break;
			System.out.print(" " + x);
		}
		System.out.println();
	}
	
	private static int size(int[] arr){
		int index = 0;
		for (int i : arr){
			if (i == SENTINEL) return index;
			index++;
		}
		return index;
	}

	private static int[] intersection(int[] arr1, int[] arr2) {
		int[] result = new int[SIZE];
		int index = 0;
		for (int x: arr1){
			if (x == SENTINEL) return result;
			for (int y: arr2){
				if (y == SENTINEL) break;
				if (x == y){
					result[index++] = x;
				}
			}				
		}
		return result;
	}

	// values present in arr but NOT intersection
	// remove intersection values from arr
	private static int[] difference(int[] arr, int[] intersection) {
		int[] result = new int[SIZE];
		int index = 0;
		for (int x: arr){
			boolean match = false;
			if (x == SENTINEL) return result;
			
			for (int y: intersection){
				if (y == SENTINEL) break;
				if (x == y) {
					match = true;
					break;
				}
			}				
			if (!match) result[index++] = x;
		}

		return result;
	}
}
