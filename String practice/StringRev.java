/*
Q8. Write a Java program to reverse a string.
Description:Accept a string and print it in reverse order.
Input:Enter string: coding
Output:Reversed string: gnidoc
*/
import java.io.*;

public class StringRev{
	public static void main(String...x)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for(int i=str.length()-1; i>=0; i--){
			char ch = str.charAt(i);
			sb.append(ch);
		}
		System.out.println(sb.toString());
	}
}