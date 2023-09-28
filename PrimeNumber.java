package assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

//Scanner nk = new Scanner(System.in);
//System.out.print("Enter The Number:");
		// int num = nk.nextInt();
		int num = 1;
		boolean value = true;

		for (int i = 2; i <= num / 2; i++) { // condition for non prime number

			if (num % i == 0) {
				value = false;
				break;
				
			}
		}
		if(num == 1) {
			value = false;
			
			
		}

		if (value)
			System.out.println(num +" is a prime number");

		else
			System.out.println(num + "is a not prime number");

	}

}
