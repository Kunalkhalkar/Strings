/*
Q17. Write a program to find ASCII value of a character from a string.
 Input : A
 Output : 65
*/
import java.util.*;
public class FindASCII{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		for(int i = 0; i<str.length(); i++){
			char c = str.charAt(i);
			if(c != ' ')
			System.out.println((int)(c)+ "-->"+c);
		}
	}
}