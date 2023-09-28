
package assignment;

public class Vowels {

	public static void main(String[] args) {

		String s="nirmalsugathi";
		int vowels=0;
		int nonvowels=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			vowels++;
		}
		else {
			nonvowels++;
		}
		}
			System.out.println(vowels);
			System.out.println(nonvowels);
	}

}
