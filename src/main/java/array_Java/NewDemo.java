package array_Java;

import java.util.Scanner;

public class NewDemo {

	public static void main(String[] args) {
	int a=4;
	int b=3;
	int c;
	
	c=a+b;
	System.out.println(c);
	
	
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number");
	 int d= sc.nextInt();
	 System.out.println("Enter second number");
	  int e=sc.nextInt();
	  System.out.println("Adding this both values");
	  int f=d+e;
	  System.out.println(f);
	  
	  System.out.println("Now doing substaction");
	  System.out.println("Again enter first number");
	  int g=sc.nextInt();
	  System.out.println("Again enter second number");
	  int h=sc.nextInt();
	  int i=g-h;
	  System.out.println("substaction"+i);


	}

}
