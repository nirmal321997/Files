package assignment;

public class CountOfOdd {

	public static void main(String[] args) {

		int sum=0;
		System.out.println("Count of odd numbers from 1 to 100:");
		for(int i=1;i<=100;i++)
			
			if(i%2!=0)
			{
				sum++;
		}
		
		System.out.println(sum);
	}
	

}
