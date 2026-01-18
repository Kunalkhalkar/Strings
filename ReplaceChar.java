/*
Q18. Write a program to replace a character in a string.
 Input: banana, 
replace a with o
 Output : bonono
*/
import java.util.*;
public class ReplaceChar{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Enter a character to change the occurance");
		char c = sc.nextLine().charAt(0);
		System.out.println("Enter a character to change with the occurance");
		String c1 = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		for(int i =0; i< str.length(); i++){
			char temp = sb.charAt(i);
			if(temp == c)
				sb.replace(i,i+1, c1);
		}
		System.out.println("String after, "+sb);
		
	}
}