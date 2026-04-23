/*
Q2. Write a Java program to count total vowels in a string.
Description:Accept a string and count how many vowels (a,e,i,o,u) are present.
Input:Enter string: education
Output:Total vowels are: 5
*/
import java.util.*;
import java.io.*;

public class StringCountVowel{
	public static void main(String ...x) throws Exception{
		System.out.println("Enter the String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int count=0;
		for(int i =0; i<str.length(); i++){
			str = str.toLowerCase();
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u')
			{
				count++;
			}
		}
		System.out.println("Vowels count is : "+ count);
	}
}