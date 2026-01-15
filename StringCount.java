/*
Q10. Write a program to count total words in a string.
 Input : Java is easy
 Output : 3
*/
import java.util.*;
public class StringCount{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		StringBuilder str = new StringBuilder("");
		int count = 1;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
				count++;
			}
		}
		System.out.println(count);
	}
}