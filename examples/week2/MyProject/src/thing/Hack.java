package thing;

import myPackage.Pair;

public class Hack {
	
	public static void main(String... args){
		Hack h = new Hack();
		h.meth("fred", 6); // actual parameters
		int x = 3;
		int y = 4;
//		System.out.println(x);
//		System.out.println(y);
//		h.swap(x, y);
//		System.out.println(x);
//		System.out.println(y);
		Pair p = new Pair(3,4);
		Pair p1 = new Pair(5,6);
		System.out.println("" + p + " " + p1);
		h.swap(p, p1);
		System.out.println("" + p + " " + p1);		
	}
	
	int meth(String s, int a){ // formal parameters
		return ++a;
	}
	
	void swap(int x, int y){
		int temp = x;
		x = y;
		y = temp;
	}
	
	void swap(Pair x, Pair y){
		Pair temp = x;
		x = y;
		y = temp;		
	}
	
	

}
