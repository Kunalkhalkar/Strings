/*
Q23. Write a Java program to remove all spaces.
Description:Remove spaces manually.
Input:Enter string: Java is easy
Output:Javaiseasy
*/

import java.util.*;
public class RemoveSpaces{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch == ' '){
				
				continue;
				
			}
			sb.append(ch);
		}
		System.out.println(sb.toString());
	}
}