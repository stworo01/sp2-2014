package myPackageImplementations;

import myPackage.Person;

public class MyPersonFactory {
	
	public static Person getPerson(){
		return PersonImpl.create();
	}

}
