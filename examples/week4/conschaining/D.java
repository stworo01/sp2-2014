package conschaining;

class A {
	A(){this("asa");}
	A(String s){}
}
class B extends A {
	protected int j;
	public B(int x){
		this();
		x = j;
	}
	public B(){
		j = 111101;
	}
}
class C extends B {
	protected int j = 12;
	public C(int j){
		this.j = j;
	}
	public C(){}
}
public class D extends C {
	private int i;	
	{
		i = 34;
	}	
	public D(int i){
		super(i);
		assert(3==4);
		this.i = i;
		System.out.println(this);
	}	
	public D(){
		System.out.println("D()");
		System.out.println(this);
	}
	public String toString(){
		return "i = " + i;
	}
}