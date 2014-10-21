package miexample2;

public class PersonImpl implements Person {
	@Override
	public int getAge(){
		System.out.println("In the class of PersonImpl");
		return -99;
	}

}
