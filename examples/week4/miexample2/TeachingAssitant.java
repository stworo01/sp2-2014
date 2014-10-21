package miexample2;

public interface TeachingAssitant extends Student, Academic{
	public default int getAge(){
		System.out.println("In the interface of TeachingAssistant");
		//...
		return -99;
	}

}