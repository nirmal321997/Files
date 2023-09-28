package assignment;

public class SwapWithout {
	
	static void answer() {
		int a=30;
		int b=20;
		
		System.out.println("Before Swapping....Using XOR");
		System.out.println("a:" +a);
		System.out.println("b:" +b);
		
		{
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		}
		System.out.println("After Swapping....Using XOR");
		System.out.println("a:" +a);
		System.out.println("b:" +b);
		
	}

	public static void main(String[] args) {
		SwapWithout value = new SwapWithout();
		int a=20;
		int b=10;
		
		System.out.println("Before Swapping....");
		System.out.println("a:" +a);
		System.out.println("b:" +b);
		
		{
			a = a+b;           //a=30
			b=a-b;             //b=20
			a=a-b;             //a=10
			}
		System.out.println("After Swapping....");
		System.out.println("a:" +a);
		System.out.println("b:" +b);
		value.answer();
	}

}
