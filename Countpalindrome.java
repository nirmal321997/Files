package assignment;

public class Countpalindrome {

	public static void main(String[] args) {

		int num1,num2;
		int sum =0;
		int a=1;
		int b=1000;
		
		for(int i=a; i<=b; i++) {
			int x=i;
			num1=0;
			
			while(x!=0) {
				
				num2=x%10;
				num1=num1*10+num2;
				x=x/10;
			}
			if(num1==i) {
				sum++;
			}
		}
		System.out.println("The count of palindrome number from 1 to 1000:"+sum);
	}
}
