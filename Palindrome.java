package assignment;

public class Palindrome {
	
	static void raju(int a) {
		int n=0,t;
		t=a;
		
		while(a>0) {
			int s =a%10;
			n = n*10 + s;
			a = a/10;
		}
		if(t==n)
			System.out.println(n+ "is a palidrome number.");
		else
			System.out.println(n+ "is not a palidrome number.");
	}

	public static void main(String[] args) {

		Palindrome.raju(121);
 		Palindrome.raju(555);
		
		
	}

}
