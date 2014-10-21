package miexample2;

public interface Person {

	public default int getAge(){
		System.out.println("In the interface of Person");
		return -99;
	}
}