/*
Q5. Write a program to count consonants in a string.
 Input: Computer
 Output: 5
*/
import java.util.*;
public class Consonent{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int count= 0;
		for(int i= 0; i<s.length(); i++){
			if(s.charAt(i) !='a' && s.charAt(i) !='e' && s.charAt(i) !='i' && s.charAt(i) !='o' && s.charAt(i) !='u' )
			{
				++count;
			}
		}
		System.out.println(count);
	}
}