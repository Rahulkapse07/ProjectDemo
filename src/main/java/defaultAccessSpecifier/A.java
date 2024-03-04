package defaultAccessSpecifier;

public class A {

	static  void display()  //no access modifier indicates default modifier
	{
	  System.out.println("A class method calling");
	}
	
	
	public static void main(String[] args) {
		display();
	}
}
