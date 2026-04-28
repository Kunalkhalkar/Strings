/*
Q21. Write a Java program to find the frequency of a character.
Description:Count how many times a character appears.
Input:
 Enter string: banana
 Enter character: a
Output:Frequency is: 3
*/
import java.util.*;
public class FrequencyChar{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter the character to check occurance");
		char ch = sc.next().charAt(0);
		
		int count =0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)== ch){
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}