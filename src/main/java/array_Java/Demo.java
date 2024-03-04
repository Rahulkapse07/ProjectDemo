package array_Java;

public class Demo {

	public static void main(String[] args) {
		
		String[] array = new String[2];
		array[0]="Rahul";
		array[1]="Kapse";
		//array[2]="test";                 //IndexOutOfBoundException
		
		System.out.println(array[0]);
		
		String [] cars= {"Volvo", "BMW", "Ford", "Mazda"};
		
		int[] myNum = {10, 20, 30, 40};
		myNum[0]=50;
		System.out.println(myNum[0]);

	

		System.out.println(cars[0]);
		System.out.println(cars.length);
		
		char [] cars1=cars[0].toCharArray();
		System.out.println(cars1[0]);   //Printing char on index of 1
		
	    
	    System.out.println("*************************************");
	    
	    System.out.println("Before Changed of Array Element :-"+cars[0]);
	    cars[0] = "Opel";     //Change an array element
	    System.out.println("After Changed of Array Element :-"+cars[0]);
	    
	    System.out.println("*************************************");
	    
	    System.out.println("Iterating elemet through For Loop -");
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
			
		}
	    
		
		
		
	
		
		//Multidimensional Arrays
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };               // 1 2 3 4
		                                                               // 5 6 7
		
		System.out.println("Accessing values from multidimensional array :-"+myNumbers[1][2]);     //[row][column]
		
		int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
		
	    for (int i = 0; i < myNumbers1.length; ++i)
	    {
	      for(int j = 0; j < myNumbers1[i].length; ++j) 
	      {
	        System.out.print(myNumbers1[i][j]);
	      }
	      System.out.println();
	   }
		
	} 

}
