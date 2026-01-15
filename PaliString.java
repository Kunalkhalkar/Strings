/*
Q7. Write a program to check whether a string is palindrome or not.
 Input : madam
 Output : Palindrome
*/
import java.util.*;
public class PaliString{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		String rev = reverse(str);
		if(rev.equals(str)){
			System.out.println("string is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}
	}
	
	public static String reverse(String str){
		char ch[] = str.toCharArray();	
		for(int i= 0, j=ch.length-1; i <ch.length/2; i++, j--){
			 char temp = ch[i];
			 ch[i] = ch[j];
			 ch[j]= temp;
		}
		String abs = new String(ch);
		return abs;
	}
	
}

