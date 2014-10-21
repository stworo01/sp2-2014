package miexample2;

public interface Academic extends Person{
	public default int getAge(){
		System.out.println("In the interface of Academic");
		return -99;
	}
}