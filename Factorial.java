package assignment;

public class Factorial  {

	void factnum(int fact) {
		int i;
		int number=1;
		for(i=1;i<=fact;i++) {
			number=number*i;
		}
		System.out.println(fact+"is the factorial of " +number);
	}

		public static void main(String[] args) {
			Factorial obj = new Factorial();
			
			obj.factnum(4);
			obj.factnum(5);
			obj.factnum(6);

		}

	
	}


