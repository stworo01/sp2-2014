package myPackage;

public class PairTester {

	public static void main(String[] args) {
		Pair p = new Pair();
		p.setX(3);
		p.setY(4);
		
		//System.out.println(p);
		
		Pair p1 = new Pair();
		p1.setX(3);
		p1.setY(4);

		System.out.println(p.equals(p1));
	}

}
