package assignment;

public class Countprime {
	
	void nirmal(int a) {
		int count;
		int sum=0;
		
		for(int i=1;i<=a;i++) {
			count=0;
			
			if(i==1) {
				count++;
			}
		
		
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==0) {
			
			sum++;			
		
		}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Countprime obj = new Countprime();
		obj.nirmal(100);

	}

}
