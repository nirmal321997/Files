package assignment;

public class FindOddEven {

	public static void value(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is even number");
		} else if (number % 2 != 0) {
			System.out.println(number + " is odd number");
		}

	}

	public static void main(String[] args) {
		FindOddEven.value(1);
		FindOddEven.value(20);
		FindOddEven.value(55);

	}

}
