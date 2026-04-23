/*
Q16. Write a Java program to replace space with underscore.
Description:Replace every space with '_' character.
Input:Enter string: Java Program
Output:Java_Program
*/
import java.io.*;
public class ReplaceChar{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' '){
				sb.append('_');
			}
			else{
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}