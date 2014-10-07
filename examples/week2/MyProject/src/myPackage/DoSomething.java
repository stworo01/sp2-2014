package myPackage;

import java.util.Scanner;

public class DoSomething {
	private final static int STOP = -1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int total = 0;
		do {
			System.out.print("Enter a +ve number, -1 to stop: ");
			num = sc.nextInt();
			// total += num;
			if (num == STOP) break; 
			
			total += num;	
		} while (true); //num != STOP);
		sc.close();
		
		//total++;
		
		System.out.println("The total is :" + total);
	}
	
	

}