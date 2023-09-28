package assignment;
import java.util.*;

public class Consicutive {


	public static void main(String[] args) {
	String S = "saathhiiish";
	int letter=0;
	int number=0;
	for(int i=0;i<S.length();i++) {
		char ch=S.charAt(i);
		if(ch=='a'||ch=='i'||ch=='h') {
letter++;
	}
		else {
		}
	}
	System.out.println(letter);
 

	}

}
