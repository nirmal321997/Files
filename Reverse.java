package assignment;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
System.out.println("Enter the value:");
Scanner op = new Scanner (System.in);

		int num = op.nextInt();
		int rev = 0;
		
		while(num!=0)
		{
			int remainder = num%10;
			rev = rev*10 + remainder;
			num = num/10;
		}
		System.out.println("The reverse of the given number:" +rev);
	}

}
