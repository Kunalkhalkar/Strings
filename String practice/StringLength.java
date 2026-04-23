/*Q1. Write a Java program to count total characters in a given string.
Description: Accept a string from the user and calculate the total number of characters present in it (including spaces).
Input:Enter string: Hello World
Output: Total characters are: 11
*/
import java.util.*;
public class StringLength{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		int count= 0;
		for(int i=0; i<str.length(); i++){
			count++;
		}
		System.out.println("length is : "+ count);
	}
}