/*
Q22. Write a Java program to remove all vowels.
Description:Remove vowels and print remaining string.
Input:Enter string: education
Output:dctn
*/

import java.util.*;
public class RemoveVowels{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch =='e' || ch =='i' || ch == 'o' || ch == 'u'){
				continue;
			}
			else{
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}