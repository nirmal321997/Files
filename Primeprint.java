package assignment;

public class Primeprint {

void method(int a) {
		int count;
		for(int i =1;i<=a;i++) {
			count=0;
			
			if(i == 1) {
				count++;
			}
		
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			
			}
		}
	}

	public static void main(String[] args) {
		Primeprint obj= new Primeprint();
				obj.method(20);
	}

}
