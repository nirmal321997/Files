package assignment;

public class Fibonacci {

	public static void main(String[] args) {

		int n=0;
		int m=1;
		int i=0;
		while(i<=10)
		//	for(i=0;i<=10;i++)
		{
			i++;
			System.out.print("");
			System.out.println(n);
		int p=n+m;
			n=m;
			m=p;
		}
		
	}

}
