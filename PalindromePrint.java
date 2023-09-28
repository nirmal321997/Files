package assignment;

public class PalindromePrint {
	
	

	public static void main(String[] args) {
		
		int num1,num2;
		int a=1;
		int b=100;
		
		for(int i=a; i<=b; i++) {
			int x=i;
			num1=0;
			
			while(x!=0) {
				
				num2=x%10;
				num1=num1*10+num2;
				x=x/10;
			}
			if(num1==i) {
				System.out.print(" "+i);
			}
		}
	}

}
