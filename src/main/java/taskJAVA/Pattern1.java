package taskJAVA;

import java.util.Scanner;

public class Pattern1 {
	
	public static void main(String[] args) {
	//   Scanner sc=new Scanner(System.in);
//	   System.out.println("please enter a number value :");
//	   int num1=sc.nextInt();
	  int num=5;
		
//		for(int i=0 ; i<num; i++)
//		{
//			for(int j=0 ;j<i ;j++)
//			{
//			System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
	System.out.println("*******************");
	
	for(int i=4 ; i>num; i++)
	{
		for(int j=0 ;j<i ;j--)
		{
		System.out.println("#");
		}
		System.out.print(" ");
	}

	}
	
}
