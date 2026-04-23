/*
Q12. Write a Java program to find the first character of a string.
Description:Accept string and print first character.
Input:Enter string: Laptop
Output:First character is: L
*/
import java.io.*;
public class FirstChar{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		
		System.out.println(str.charAt(0));
	}
}