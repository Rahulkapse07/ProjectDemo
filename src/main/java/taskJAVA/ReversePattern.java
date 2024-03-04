package taskJAVA;

public class ReversePattern {
	public static void main(String[] args) {
		
		int num=5;
		for(int i=4;i>num;i--){
			System.out.println("inside for loop");
			for(int j=0;j<i;j--)
			{
			System.out.println("#");
			}
			System.out.print(" ");
		}

		}
	

}
