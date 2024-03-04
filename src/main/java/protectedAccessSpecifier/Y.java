package protectedAccessSpecifier;

import defaultAccessSpecifier.A;
import defaultAccessSpecifier.TestProtected;


public class Y extends TestProtected {
	
	public static void main(String[] args) {
		A test=new A();
		//test.display()  ;    //Because Access specifiers of display() is Default
		
		// Extend Class A to Learn Protected and then call display method
		
		// Public -just create a object of that class and call method
		
		
		
		
	}

}
