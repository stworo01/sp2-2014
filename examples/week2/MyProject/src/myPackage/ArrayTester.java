package myPackage;

public class ArrayTester {
	private final static int NUMBER = 10;
	
	public static void main(String[] args) {
		int[] intArray = new int[NUMBER];
		
		for(int index = 0; index < intArray.length; index++){
			intArray[index] = (index + 1) * (index + 1);
		}
		
		for(int element: intArray){
			System.out.println(element);
		}
	}

}
