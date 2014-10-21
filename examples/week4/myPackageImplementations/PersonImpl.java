package myPackageImplementations;

import myPackage.Person;

public class PersonImpl implements Person {
	private int age;
	private boolean die;

	private PersonImpl() {
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public boolean die() {
		return die;
	}

	@Override
	public String toString() {
		return "asjkldhkashd";
	}

	static Person create() {
		return new PersonImpl();
	}

}
