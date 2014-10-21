package mytester;

import myPackage.Person;
import myPackageImplementations.MyPersonFactory;
import myPackageImplementations.PersonImpl;

public class MyTest {

	public static void main(String... args) {
		//Person p = new PersonImpl();
		Person p = MyPersonFactory.getPerson();
		
		//System.out.println(p);
		System.out.println(p.getClass());
	}

}
