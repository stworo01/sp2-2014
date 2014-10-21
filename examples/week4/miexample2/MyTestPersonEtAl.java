package miexample2;

public class MyTestPersonEtAl {
	public static void main(String[] args) {
//		Person p = new PersonImpl();
//		System.out.println(p.getAge());
//		
//		Person p1 = new AcademicImpl();
//		System.out.println(p1.getAge());
//		
//		Person p2 = new StudentImpl();
//		System.out.println(p2.getAge());

		
		Person p = new PersonImpl();
		System.out.println(p.getAge());
		
		Person p1 = new TeachingAssistantImpl();
		System.out.println(p1.getAge());
		
	}
}
