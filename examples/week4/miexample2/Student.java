package miexample2;

public interface Student extends Person {
	public default int getAge(){
		System.out.println("In the interface of Student");
		return -99;
	}
}