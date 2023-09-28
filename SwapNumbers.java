package assignment;

public class SwapNumbers {

	public static void main(String[] args) {

		int a=20;
		int b=10;
		
		System.out.println("Before Swapping....");
		System.out.println("a:" +a);
		System.out.println("b:" +b);
		
		{
			int temp;
			temp=a;                    //temp=20;
			a=b;                      //a=10;
			b=temp;                  //b=20;
		}
		System.out.println("After Swapping....");
		System.out.println("a:" +a);
		System.out.println("b:" +b);
	}

}
